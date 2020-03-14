import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { Ipo } from './models/ipo';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class IpoService {
  
  httpUrl= environment.host + "initialpublicoffering-service/ipo/";
  ipo=Ipo;
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }
  getAllIPO(): Observable<Ipo[]> {
    return this.httpClient.get<Ipo[]>(this.httpUrl);
  }
  saveIPO(ipo:Ipo):Observable<Ipo>{
    return this.httpClient.post<Ipo>(this.httpUrl, ipo);
  }

  deleteIPO(id:number):Observable<Ipo>{
    return this.ht.delete(this.httpUrl+id);
  }
  updateIPOInfo(ipo :Ipo):Observable<Ipo>{
    return  this.ht.put(this.httpUrl,ipo);
  }
  getIPOById(id :number):Observable<Ipo>{
    return this.ht.get(this.httpUrl+id);
  }
}


