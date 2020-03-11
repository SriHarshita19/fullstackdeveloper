import { Injectable, Inject } from '@angular/core';
import { Company } from './models/company';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
    httpUrl = 'http://localhost:8122/companyall/';
    //company = Company;
   constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
   getAllCompanies(): Observable<Company[]> {
     return this.httpClient.get<Company[]>(this.httpUrl);
   }
   saveCompanies(com:Company):Observable<Company>{
     return this.ht.post(this.httpUrl,com);
   }
   deleteCompanies(id:number):Observable<Company>{
     return this.ht.delete(`http://localhost:8122/deletecompany/${id}`);
   }
   updateCompaniesInfo(com :Company):Observable<Company>{
     return this.ht.put(`http://localhost:8122/updatecompany`,com);
   }
   getCompaniesById(id :number):Observable<Company>{
     return this.ht.get(`http://localhost:8122/companyid/${id}`);
   }
 }