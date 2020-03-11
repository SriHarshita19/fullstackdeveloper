import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { ServiceService } from './service.service';
import { User } from './models/user';

const url = "http://localhost:8765/register-service/login";

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private userService:ServiceService,private http:HttpClient) { }

  authenticate(username:string,password:string){
    let authenticationToken="Basic " + window.btoa(username+":"+password);
    console.log(authenticationToken);

    let headers = new HttpHeaders({
      Authorization: authenticationToken
    });
    console.log("calling server")
    console.log(authenticationToken);
    return this.http.get(url, {headers}).pipe(
      map((data: User) => {
        sessionStorage.setItem("username", username);
        sessionStorage.setItem("token", authenticationToken);
        sessionStorage.setItem("userType",data.role==="ROLE_ADMIN" ? "admin":"user"); 
        return data;
      }),
      map(error => {
        return error;
      })
    );
  }
  getAuthenticationToken() {
    if (this.isUserLoggedIn())
      return sessionStorage.getItem("token");
    return null;
  }
  isUserLoggedIn(): boolean {
    let user = sessionStorage.getItem('username');
    if (user == null)
      return false;
    return true;
  }
  getProfileUrl(): string {
    let url = sessionStorage.getItem("profile");
    return url;
  }
  logout() {
    sessionStorage.removeItem('username');
    sessionStorage.removeItem("token");
    sessionStorage.removeItem("role");
  }
  getUserDetails(): string {
    let user = sessionStorage.getItem('username');
    return user;
  }
}
  

