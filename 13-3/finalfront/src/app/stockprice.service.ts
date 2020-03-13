import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockPrice } from './models/price';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StockpriceService {

  
    httpUrl = environment.host + "/stockprice-service/stockprice/";
    constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
    getAllPrice(): Observable<StockPrice[]> {
      return this.httpClient.get<StockPrice[]>(this.httpUrl);
    }
    savePrice(price:StockPrice):Observable<StockPrice>{
      return this.ht.post(this.httpUrl, price);
    }
    deletePrice(id:number):Observable<StockPrice>{
      return this.ht.delete(this.httpUrl+id);
    }
    updatePriceInfo(price :StockPrice):Observable<StockPrice>{
      return this.ht.put(this.httpUrl , price);
    }
    getPriceById(id :number):Observable<StockPrice>{
      return this.ht.get(this.httpUrl+id);
    }
}
