import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from '@angular/http';

@Injectable()
export class AppService {
  private url: string = 'http://localhost:8081/';
  constructor(private http: Http) {}
  postJSON(obj: Object, urlApi: String) {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    let body = JSON.stringify(obj);
    return this.http.post( this.url + urlApi, body, options)
      .map(res => res.json());
  }
  getUrl(): string {
    return this.url;
  }
}
