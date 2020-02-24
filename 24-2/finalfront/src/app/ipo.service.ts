import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { Ipo } from './models/ipo';
@Injectable({
  providedIn: 'root'
})
export class IpoService {
  httpUrl=`http://localhost:8080/ipoall/`; 
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }
  getAllIPO(): Observable<Ipo[]> {
    return this.ht.get(this.httpUrl);
  }
  saveIPO(ipo:Ipo):Observable<Ipo>{
    return this.ht.post(this.httpUrl, ipo);
  }

  deleteIPO(id:number):Observable<Ipo>{
    return this.ht.delete(`http://localhost:8080/ipo/${id}`);
  }
  updateIPOInfo(ipo :Ipo):Observable<Ipo>{
    return  this.ht.put(`http://localhost:8080/updateipo`,ipo);
  }
  getIPOById(id :number):Observable<Ipo>{
    return this.ht.get(`http://localhost:8080/ipoid/${id}`);
  }
}


