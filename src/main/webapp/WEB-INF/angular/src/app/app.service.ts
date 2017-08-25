import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from '@angular/http';
import {AppSettings} from "./app.settings";

@Injectable()
export class AppService {
  constructor(private http: Http) {}
  postJSON(obj: Object, urlApi: String) {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    let body = JSON.stringify(obj);
    return this.http.post( AppSettings.URL + urlApi, body, options)
      .map(res => res.json());
  }
}
