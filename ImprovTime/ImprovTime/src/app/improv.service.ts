import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { UrlService } from './url.service';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ImprovService {

  constructor(private http: HttpClient, private urlService: UrlService) { }

  getImprov(): Observable<any> {
    return this.http.get(this.urlService.getUrl() + 'set').pipe(
      map( resp => resp )
    );
  }
}
