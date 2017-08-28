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
  parents: Parent[];
  selectedParent: Parent;
  @Output() parentChanged = new EventEmitter();

  constructor(private _http: Http) {
    _http.get(`${AppSettings.URL}api/parents/fetchAll`).subscribe(response => this.parents = response.json());
  }

  changeParent(selectedParent: Parent) {
    console.log('ParentsDropdownComponent: new parent selected, parent Id = ' + selectedParent.id);
    this.parentChanged.emit(selectedParent);
  }

  ngOnInit() {
  }

}
