import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpInterceptorBasicAuthService implements HttpInterceptor {

  constructor() { }
  intercept(request:HttpRequest<any>,next:HttpHandler){
    let username="user"
    let password="pwd";
    let basicAuthHeaderString="Basic "+window.btoa(username+":"+password);
    request=request.clone({
      setHeaders: {
        Authorization : basicAuthHeaderString
      }
    })
    return next.handle(request);

  }
}
