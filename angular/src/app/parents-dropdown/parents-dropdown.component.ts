import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {BrowserXhr, CookieXSRFStrategy, Http, RequestOptions, ResponseOptions, XHRBackend} from '@angular/http';
import 'rxjs/Rx';
import {Parent} from './parent.model';
import {MdSelectModule} from '@angular/material';
import {AppSettings} from "../app.settings";


@Component({
  selector: 'app-parents-dropdown',
  templateUrl: './parents-dropdown.component.html',
  styleUrls: ['./parents-dropdown.component.css']
})
export class ParentsDropdownComponent implements OnInit {

  private parents: Parent[];
  private http: Http;
  private selectedParent: string;
  @Output() private parentChanged = new EventEmitter();

  constructor() {
    const browserXhr: BrowserXhr = new BrowserXhr();
    const baseResponseOptions: ResponseOptions = new ResponseOptions();
    const xsrfStrategy: CookieXSRFStrategy = new CookieXSRFStrategy();
    const backend: XHRBackend = new XHRBackend(browserXhr, baseResponseOptions, xsrfStrategy);
    const requestOptions: RequestOptions = new RequestOptions();
    const http: Http = new Http(backend, requestOptions);
    this.http = http;
    this.http.get(`${AppSettings.URL}/parent/fetchAll`).subscribe(response => this.parents = response.json());
  }

  changeParent(selectedParent: Parent) {
    console.log('ParentsDropdownComponent: new parent selected, parent Id = ' + selectedParent.id);
    this.parentChanged.emit(selectedParent);
  }

  ngOnInit() {
  }

}
