import { Component, OnInit } from '@angular/core';
import {SchoolClass} from './school-classes-table.model';
import {BrowserXhr, CookieXSRFStrategy, Http, RequestOptions, ResponseOptions, XHRBackend} from '@angular/http';
import 'rxjs/Rx';
import {AppService} from '../app.service';
import {BehaviorSubject} from 'rxjs/BehaviorSubject';
import {Observable} from 'rxjs/Observable';
import {DataSource} from '@angular/cdk/table';
import {AppSettings} from "../app.settings";

@Component({
  selector: 'app-class',
  templateUrl: './school-class-table.component.html',
  styleUrls: ['./school-class-table.component.css']
})
export class SchoolClassTableComponent implements OnInit {
  private http: Http;
  displayedColumns = ['name', 'curator'];
  exampleDatabase: ExampleDatabase;
  dataSource: ExampleDataSource | null;

  classes: SchoolClass[];
  constructor() {
    const browserXhr: BrowserXhr = new BrowserXhr();
    const baseResponseOptions: ResponseOptions = new ResponseOptions();
    const xsrfStrategy: CookieXSRFStrategy = new CookieXSRFStrategy();
    const backend: XHRBackend = new XHRBackend(browserXhr, baseResponseOptions, xsrfStrategy);
    const requestOptions: RequestOptions = new RequestOptions();
    const http: Http = new Http(backend, requestOptions);
    this.http = http;
    this.exampleDatabase = new ExampleDatabase(this.http);
  }
  ngOnInit() {
    this.dataSource = new ExampleDataSource(this.exampleDatabase);
  }
}
export class ExampleDatabase {
  /** Stream that emits whenever the data has been modified. */
  dataChange: BehaviorSubject<SchoolClass[]> = new BehaviorSubject<SchoolClass[]>([]);
  get data(): SchoolClass[] { return this.dataChange.value; }
  private url: string;
  private urlApi: string;
  private http: Http;
  private service: AppService;
  classes: SchoolClass[];
  constructor(http: Http) {
    this.http = http;
    this.url = AppSettings.URL;
    this.urlApi = 'classes/getAllByName';
    this.http.get(this.url + this.urlApi).subscribe(response => this.dataChange.next(response.json()));
  }
}
export class ExampleDataSource extends DataSource<any> {
  constructor(private _exampleDatabase: ExampleDatabase) {
    super();
  }

  /** Connect function called by the table to retrieve one stream containing the data to render. */
  connect(): Observable<SchoolClass[]> {
    return this._exampleDatabase.dataChange;
  }

  disconnect() {}
}
