import { Injectable, Inject } from '@angular/core';
//import {USERS} from '../app/models/mock-user';
import { Observable } from 'rxjs';
import { User } from './models/user';
import{HttpClient} from '@angular/common/http';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
 
  httpUrl= environment.host + "register-service/register/";
  users=User;
  constructor(private httpClient:HttpClient , @Inject (HttpClient) private ht) { }

  getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User){
    return this.ht.post(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(this.httpUrl + id);
  }
  updateUserInfo(user :User):Observable<User>{
    return this.ht.put(this.httpUrl,user);
  }
  getUserById(id :number):Observable<User>{
    return this.ht.get(this.httpUrl + id);
  }
  reg()
  {
    return this.ht.get(this.httpUrl);
  }
  serActivation(obj){
    return this.ht.put(this.httpUrl+"activate", obj)
  }

  LoggedIn(){
    let user_id = localStorage.getItem('userId');
    if(user_id==null){
      return false;
    }else{
      return true;
    }
  }
  isActivated(user:User)
  {
    if(user.active == "yes"){
      return true;
    }

  }
  isAdmin(){
    if (sessionStorage.getItem("userType")=="admin")
    {
      return true;
    }
    else
     {
       return false;
     }
}
}

