import { Injectable, Inject } from '@angular/core';
import { BlogPost } from './blog-post';
import {HttpClient, HttpHeaders} from '@angular/common/http';

export class HelloWorldBean{
    constructor(public message:string){}
}

@Injectable({
  providedIn: 'root'
})
export class BlogDadaService {

  constructor(@Inject (HttpClient) private ht) { }


//   getDataFromBootwithparam(name){
//     return this.ht.get(`http://localhost:8080/${name}`);
//  }

 getAllData(){
   let basicAuthHeaderString=this.basicAuthenticationHttpHeader();

   let headers=new HttpHeaders({
    Authrorization:basicAuthHeaderString
   })

  return this.ht.get("http://localhost:8080/customers",{headers});
  }

  getTotalData(){
    return this.ht.get("http://localhost:8080/prod");
  }

  getdatabyId(id){
    return this.ht.get(`http://localhost:8080/prod/${id}`);
  }

  deletedatabyId(id){
    //return this.ht.delete(`http://localhost:8080/customers/${id}`);
    return this.ht.post(`http://localhost:8080/prod/${id}`);
  }

  updatedatabyId(obj,id){
    //return this.ht.delete(`http://localhost:8080/customers/${id}`);
    return this.ht.put(`http://localhost:8080/customers/${id}`,obj);
  }

  saveData(obj){
    //return this.ht.delete(`http://localhost:8080/customers/${id}`);
    return this.ht.post(`http://localhost:8080/customers`,obj);
  }

  basicAuthenticationHttpHeader(){
    let username="user"
    let password="pwd";
    let basicAuthHeaderString="Basic "+window.btoa(username+":"+password);
    return basicAuthHeaderString;
  }

  getMydata(){
    return this.ht.post(`http://localhost:8080/customers`);
  }
  executeBasicAuthSrvice(username,password){   
    let basicAuthHeaderString="Basic "+window.btoa(username+":"+password);
    let headers=new HttpHeaders({
      Authrorization:basicAuthHeaderString
     })
     return this.ht.get(`http://localhost:8080/basicauth`,{headers});
  }

  isUserLoggedIn(){
    let user=sessionStorage.getItem("authenticateuser");
    return !(user==null)
  }
  
  getData():BlogPost[][]{
    return[
         [ 
        {
        title:"Post 1",
        summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
        },
        {
         title:"Post 2",
         summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
         },
         {
         title:"Post 3",
         summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
         }
      ],
      [
       {
       title:"Post 4",
       summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
       },
       {
        title:"Post 5",
        summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
        },
        {
        title:"Post 6",
        summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
        }
     ],
     [
       {
       title:"Post 7",
       summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
       },
       {
        title:"Post 8",
        summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
        },
        {
        title:"Post 9",
        summary:"Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."
        }
     ]
    ]
    
  }
}
