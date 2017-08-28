import {Component, Injectable, Input, OnInit} from '@angular/core';
import {Child} from './child.model';
import {BrowserXhr, CookieXSRFStrategy, Http, RequestOptions, ResponseOptions, XHRBackend} from '@angular/http';
import {DataSource} from '@angular/cdk/table';
import {BehaviorSubject} from 'rxjs/BehaviorSubject';
import {Observable} from 'rxjs/Observable';
import 'rxjs/Rx';
import {Parent} from '../parents-dropdown/parent.model';
import {AppSettings} from "../app.settings";

@Component({
  selector: 'app-child-table',
  templateUrl: './child-table.component.html',
  styleUrls: ['./child-table.component.css']
})


export class ChildTableComponent implements OnInit {
  displayedColumns = ['firstName', 'lastName', 'patronymic'];
  childrenDatabase: ExampleDatabase;
  dataSource: ExampleDataSource | null;
  parentFilter = 'All children';

  ngOnInit() {
    this.dataSource = new ExampleDataSource(this.childrenDatabase);
  }

  constructor(private _http: Http) {
    this.childrenDatabase = new ExampleDatabase(_http);
  }

  changeParent(parent: Parent) {
    console.log('ChildTableComponent: changing parent, new parent id = ' + parent.id);
    this.parentFilter = `Children by ${parent.firstName} ${parent.lastName}`;
    this.childrenDatabase.reloadChildren(parent.id);
  }
}

export class ExampleDatabase {

  dataChange: BehaviorSubject<Child[]> = new BehaviorSubject<Child[]>([]);
  get data(): Child[] { return this.dataChange.value; }
  private http: Http;

  constructor(http: Http) {
    this.http = http;
    this.http.get(AppSettings.URL + '/child/fetchAll').subscribe(response => this.dataChange.next(response.json()));
  }
  reloadChildren(parentId: string) {
    this.http.get(`${AppSettings.URL}/child/fetchByParent?parentId=${parentId}`)
      .subscribe(response => this.dataChange.next(response.json()));
  }
}

export class ExampleDataSource extends DataSource<any> {
  constructor(private _exampleDatabase: ExampleDatabase) {
    super();
  }

  connect(): Observable<Child[]> {
    return this._exampleDatabase.dataChange;
  }

  disconnect() {}
}
