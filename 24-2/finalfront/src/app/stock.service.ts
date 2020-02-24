import { Injectable } from '@angular/core';
import { Stock } from './models/stock';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class StockService {
  httpUrl = ' http://localhost:8080/stockexchangeall/';
   stock = Stock;

  constructor(private httpClient: HttpClient) { }
  getAllStock(): Observable<Stock[]> {
    return this.httpClient.get<Stock[]>(this.httpUrl);
  }
  saveStock(stock:Stock):Observable<Stock>{
    return this.httpClient.post<Stock>(this.httpUrl, stock);
  }

  deleteStock(id:number):Observable<Stock>{
    return this.httpClient.delete<Stock>(this.httpUrl + id);
  }
  updateStockInfo(stock :Stock):Observable<Stock>{
    return this.httpClient.put<Stock>(this.httpUrl + stock.id , stock);
  }
  getStockById(id :number):Observable<Stock>{
    return this.httpClient.get<Stock>(this.httpUrl + id);
  }
}
