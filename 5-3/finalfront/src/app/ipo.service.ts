import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { Ipo } from './models/ipo';
@Injectable({
  providedIn: 'root'
})
export class IpoService {
  
  httpUrl=`http://localhost:9001/ipoall/`; 
  ipo=Ipo;
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }
  getAllIPO(): Observable<Ipo[]> {
    return this.httpClient.get<Ipo[]>(this.httpUrl);
  }
  saveIPO(ipo:Ipo):Observable<Ipo>{
    return this.httpClient.post<Ipo>(this.httpUrl, ipo);
  }

  deleteIPO(id:number):Observable<Ipo>{
    return this.ht.delete(`http://localhost:9001/deleteipo/${id}`);
  }
  updateIPOInfo(ipo :Ipo):Observable<Ipo>{
    return  this.ht.put(`http://localhost:9001/updateipo`,ipo);
  }
  getIPOById(id :number):Observable<Ipo>{
    return this.ht.get(`http://localhost:9001/ipoid/${id}`);
  }
}


