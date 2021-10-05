import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, of, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Advertisement } from '../model/advertisement.model';

@Injectable({
  providedIn: 'root'
})
export class AdvertisementFormService {
  private adsUrl = 'api/ads/';  // URL to web api
  cudOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json'})};
  constructor(private http: HttpClient) {
    
  }

  getAd(id: number): Observable<Advertisement> {
    const url = `${this.adsUrl}/${id}`;
    return this.http.get<Advertisement>(url).pipe(
      catchError(this.handleError)
    );
  }

  getAds(): Observable<Advertisement[]> {
    return this.http.get<Advertisement[]>(this.adsUrl).pipe(
      retry(2),
      catchError((error: HttpErrorResponse) => {
        console.error(error);
        return throwError(error);
      })
    );
  }


  createAdvertisement(ad:Advertisement): Observable<Advertisement> {
    return this.http.post<Advertisement>(this.adsUrl, ad, this.cudOptions).pipe(
      catchError(this.handleError)
    );
  }

  editAdvertisement(ad: Advertisement): Observable<any> {
    return this.http.put(this.adsUrl+`/`+ad.id, ad);
  }

  deleteAdvertisement(id: number): Observable<any> {
    return this.http.delete(this.adsUrl+`/`+id);
  }

  private handleError(error: any) {
    console.error(error);
    return throwError(error);    
  }
}

