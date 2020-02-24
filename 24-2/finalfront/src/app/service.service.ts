import { Injectable, Inject } from '@angular/core';
import {USERS} from '../app/models/mock-user';
import { Observable } from 'rxjs';
import { User } from './models/user';
import{HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  httpUrl=`http://localhost:8080/registerall/`; 
users=USERS;
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }

  getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User):Observable<User>{
    return this.ht.post(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(`http://localhost:8080/register/${id}`);
  }
  updateUserInfo(user :User):Observable<User>{
    return this.ht.put(`http://localhost:8080/updateregister`,user);
  }
  getUserById(id :number):Observable<User>{
    return this.ht.get(`http://localhost:8080/registerid/${id}`);
  }
}
