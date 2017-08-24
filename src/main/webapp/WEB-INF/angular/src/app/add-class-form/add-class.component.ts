import {Component, Injectable, OnInit} from '@angular/core';
import {AppService} from '../app.service';
import {SchoolClass} from '../school-class-table/school-class';
import {BrowserXhr, CookieXSRFStrategy, Http, RequestOptions, ResponseOptions, XHRBackend} from "@angular/http/http";

@Component({
  selector: 'app-add-class',
  templateUrl: 'add-class.component.html',
  styleUrls: ['./add-class.component.css']
})
export class AddClassComponent implements OnInit {
  private postData: string;
  private http: Http;
  private url: string;
  private urlApi: string;
  constructor(private service: AppService) {
    /*const browserXhr: BrowserXhr = new BrowserXhr();
    const baseResponseOptions: ResponseOptions = new ResponseOptions();
    const xsrfStrategy: CookieXSRFStrategy = new CookieXSRFStrategy();
    const backend: XHRBackend = new XHRBackend(browserXhr, baseResponseOptions, xsrfStrategy);
    const requestOptions: RequestOptions = new RequestOptions();
    const http: Http = new Http(backend, requestOptions);
    this.http = http;
    this.url = service.getUrl();
    this.urlApi = 'classes/getAllTeacherNoActive';*/
  }
  addClass(name: string) {
    this.service.postJSON(new SchoolClass(name), 'classes/addClass').subscribe(
      data => this.postData = JSON.parse(data),
      error => alert(error),
      () => console.log('Finished')
    );
  }
  ngOnInit(): void {
  }
}
