import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockPrice } from './models/price';

@Injectable({
  providedIn: 'root'
})
export class StockpriceService {

  
    httpUrl = ' http://localhost:8080/stockpriceall/';
    constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
    getAllPrice(): Observable<StockPrice[]> {
      return this.httpClient.get<StockPrice[]>(this.httpUrl);
    }
    savePrice(price:StockPrice):Observable<StockPrice>{
      return this.ht.post(this.httpUrl, price);
    }
    deletePrice(id:number):Observable<StockPrice>{
      return this.ht.delete(`http://localhost:8080/deletestockprice/${id}`);
    }
    updatePriceInfo(price :StockPrice):Observable<StockPrice>{
      return this.ht.put(`http://localhost:8080/updatestockprice` , price);
    }
    getPriceById(id :number):Observable<StockPrice>{
      return this.ht.get(`http://localhost:8080/stockpriceid/${id}`);
    }
}
