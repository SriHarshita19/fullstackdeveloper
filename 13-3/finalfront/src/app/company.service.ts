import { Injectable, Inject } from '@angular/core';
import { Company } from './models/company';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
    httpUrl = environment.host + "company-service/company/";
    //company = Company;
   constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
   getAllCompanies(): Observable<Company[]> {
     return this.httpClient.get<Company[]>(this.httpUrl);
   }
   saveCompanies(com:Company):Observable<Company>{
     return this.ht.post(this.httpUrl,com);
   }
   deleteCompanies(id:number):Observable<Company>{
     return this.ht.delete(this.httpUrl+id);
   }
   updateCompaniesInfo(com :Company):Observable<Company>{
     return this.ht.put(this.httpUrl,com);
   }
   getCompaniesById(id :number):Observable<Company>{
     return this.ht.get(this.httpUrl+id);
   }
 }
 
