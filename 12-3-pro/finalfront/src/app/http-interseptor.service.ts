import { Injectable } from '@angular/core';
import { AuthServiceService } from './auth-service.service';
import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class HttpInterseptorService implements HttpInterceptor{

  constructor(public auth:AuthServiceService) { }
  intercept(request:HttpRequest<any>,next:HttpHandler){
    console.log("inside interceptor");
    if(this.auth.getAuthenticationToken()){
      //request cannot be directly manipulated
      //it has to be cloned
      let authenticationToken=this.auth.getAuthenticationToken();
      request=request.clone({
        setHeaders:{
          Authorization: authenticationToken
        }
      });
    }
        return next.handle(request);
  }
}
