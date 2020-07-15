import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class NewideasService {

  constructor(private http: HttpClient, private urlService: UrlService) { }

  addActivity(activity): Observable<any> {
    return this.http.post((this.urlService.getUrl() + 'activity'), {activity},
    {headers: new HttpHeaders().set('Content-Type', 'application/json')})
    .pipe(map( resp => resp ));
  }

  addCharacter(character): Observable<any> {
    return this.http.post((this.urlService.getUrl() + 'character'), {character},
    {headers: new HttpHeaders().set('Content-Type', 'application/json')})
    .pipe(map( resp => resp ));
  }

  addSetting(setting): Observable<any> {
    return this.http.post((this.urlService.getUrl() + 'setting'), {setting},
    {headers: new HttpHeaders().set('Content-Type', 'application/json')})
    .pipe(map( resp => resp ));
  }
}
