import { Injectable, Inject } from '@angular/core';
import { Stock } from './models/stock';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class StockService {
  httpUrl = ' http://localhost:9500/stockexchangeall/';
   stock = Stock;

  constructor(private httpClient: HttpClient , @Inject (HttpClient) private ht) { }
  getAllStock(): Observable<Stock[]> {
    return this.httpClient.get<Stock[]>(this.httpUrl);
  }
  saveStock(stock:Stock):Observable<Stock>{
    return this.httpClient.post<Stock>(this.httpUrl, stock);
  }

  deleteStock(id:number):Observable<Stock>{
    return  this.ht.delete(`http://localhost:9500/deletestockexchange/${id}`);
  }
  updateStockInfo(stock :Stock):Observable<Stock>{
    return this.ht.put(`http://localhost:9500/updatestockexchange`,stock);
  }
  getStockById(id :number):Observable<Stock>{
    return this.ht.get(`http://localhost:9500/stockexchangeid/${id}`);
  }
}
