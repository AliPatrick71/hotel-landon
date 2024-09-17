import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TimeService {

  private apiUrl = '/presentation-times'; // Endpoint from the Spring application

  constructor(private http: HttpClient) { }

  getPresentationTimes(): Observable<string> {
    return this.http.get(this.apiUrl, { responseType: 'text' });
  }
}
