import { Injectable, Inject } from '@angular/core';
import {USERS} from '../app/models/mock-user';
import { Observable } from 'rxjs';
import { User } from './models/user';
import{HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
 
  httpUrl=`http://localhost:8100/register/`; 
users=USERS;
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }

  getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User){
    return this.ht.post(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(`http://localhost:8100/registerid/${id}`);
  }
  updateUserInfo(user :User):Observable<User>{
    return this.ht.put(`http://localhost:8100/register`,user);
  }
  getUserById(id :number):Observable<User>{
    return this.ht.get(`http://localhost:8100/registerid/${id}`);
  }
  reg()
  {
    return this.ht.get(`http://localhost:8100/reg`);
  }
  serActivation(obj){
    return this.ht.put(`http://localhost:8100/activate`,obj)
  }
}
