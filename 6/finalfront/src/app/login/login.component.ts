import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  
//   constructor(private fb:FormBuilder, private router:Router) { }

  
//   ngOnInit() {let userIsLoggedIn = localStorage.getItem('user');
//   console.log(userIsLoggedIn);

//   userIsLoggedIn  = JSON.parse(userIsLoggedIn);

//   console.log(userIsLoggedIn);
  
//   if (userIsLoggedIn) {
//     this.router.navigate(['/admin']);
//   }

//   this.loginFormInitialisation();
// }

// loginFormInitialisation() {
constructor(){ }
  ngOnInit() {
  this.loginForm = new FormGroup({
      username: new FormControl(null),
      password: new FormControl(null),
      
    
    })

  }
  onSubmit(){
    console.log(this.loginForm.value);
    
    // localStorage.setItem('user', JSON.stringify(this.loginForm.value));
    // this.router.navigate(['/admin']);
  }
}
