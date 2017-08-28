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

  constructor(private service: AppService) {
  }
  addClass(name: string) {
    this.service.postJSON(new SchoolClass(name), 'school-class/create').subscribe(
      data => this.postData = JSON.parse(data),
      error => alert(error),
      () => console.log('Finished')
    );
  }
  ngOnInit(): void {
  }
}
