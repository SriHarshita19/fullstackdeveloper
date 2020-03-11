import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, FormBuilder, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { User } from '../models/user';
import { AuthServiceService } from '../auth-service.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  users:User[];
  currentUser: User;
  constructor(private router:Router,private formbuilder:FormBuilder,private serviceservice:ServiceService,private auth:AuthServiceService) { }
ngOnInit() {
  this.loginForm=this.formbuilder.group({
    username:['',Validators.required],
    password:['',Validators.required]
  });
  this.serviceservice.getAllUsers().subscribe(data=>{
    this.users=data;
  });
}

login(){

  let username=this.loginForm.get("username").value;
    let password=this.loginForm.get("password").value;
    const result$=this.auth.authenticate(username,password);
    result$.subscribe(data=>{
      console.log(data);
      if(sessionStorage.getItem("userType")=="admin")
      {
        this.router.navigate(['./admin'])
      }
      if(sessionStorage.getItem("userType")=="user") {
      this.router.navigate(['./user-landing']);
      }
    })
}

// isValid(){
//   let username=this.loginForm.get("username").value;
//   let password=this.loginForm.get("password").value;
//   const result$=this.auth.authenticate(username,password);
//   result$.subscribe(data=>{
//     console.log(data);
  //   if(sessionStorage.getItem("userType")=="admin")
  //   {
  //     this.router.navigate(['./admin-landing']);
  //   }
  //   if(sessionStorage.getItem("userType")=="user") {
  //   this.router.navigate(['./user-landing']);
  //   }
  //  })
//   }







// isValid(){
//   let admin_userName="admin";
//   let admin_password="admin";
//   let userName = this.loginForm.controls.username.value;
//   let password = this.loginForm.controls.password.value;
//   if((userName == admin_userName) && (password == admin_password)){
//     this.router.navigate(['admin']);
//   }else{
//     if( this.login(userName, password)){
//       if(this.serviceservice.isActivated(this.currentUser)){
//         localStorage.removeItem('userId');
//         localStorage.setItem('userId',this.currentUser.id.toString());
//         this.router.navigate(['user-landing']);
//       }else{
//         alert("please activate your account to login ");
//       } 
      
//       }else{
//         alert(" Invalid username or Password");
//         this.loginForm.reset();
//       }
//     }
//   }
//   login(userName:string, password: string){
//     for(let user of this.users ){
//       if((userName == user.username) && (password == user.password)){
//         this.currentUser= user;
//         return true;
//       }
//     }
//     return false;
//   }
// onSubmit(){
//   console.log(this.loginForm.value);
// }


}
