import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Advertisement } from '../model/advertisement.model';

@Injectable({
  providedIn: 'root',
})
export class DataService implements InMemoryDbService {
  createDb() {
    const ads = [
        {"id":1,"Title": "Pepperfry", "Name":"prasanna", "Category":"Furniture","Description":"a famous furniture"}
    ]  ;
    return {ads};
  }
  
}