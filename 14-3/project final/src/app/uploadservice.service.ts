import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UploadserviceService {
  httpUrl=environment.host +"stockprice-service/stockPrices/"
  constructor(private httpClient:HttpClient) { }
  uploadStocksSheet(formData:FormData):Observable<void>{
    return this.httpClient.post<void>(this.httpUrl+"uploadStocksSheet",formData);
  }
  getCompanyStockPricesBetween(companyCode: string, stockExchange: string, startDate: Date, endDate: Date): Observable<any[]> {
    let url = "companyStockPriceBetween/"+companyCode+"/"+stockExchange+"/"+startDate+"/"+endDate;
    return this.httpClient.get<any[]>(this.httpUrl+url);
  }
}
