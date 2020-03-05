import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, FormBuilder, Validators} from '@angular/forms';
import { ServiceService } from 'src/app/service.service';
import { User } from 'src/app/models/user';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private service:ServiceService,private router:Router) { }
  registerForm:FormGroup;
users:User[];
ngOnInit() {
  this.registerForm = this.formBuilder.group({
    id:['',Validators.required],
    username:['',Validators.required],
    firstname:['',Validators.required],
    lastname:['',Validators.required],
    email:['',[Validators.required,Validators.email]],
    phone:['',Validators.required],
    password:['',Validators.required],
  });
  this.service.getAllUsers().subscribe(u =>{this.users=u;})
}
emailVaild(e:String){
  for(let user of this.users)
  {
    if(user.email===e){
      return false;
    }
    }
    return true;
}
addUser(){
  let e=this.registerForm.controls.email.value;
  if(this.emailVaild(e)){
  this.service.saveUser(this.registerForm.value).subscribe(data => {
    //  alert('User Inserted Successfully' +data);
    //  alert('coming status'+data.regstatus);
     alert('Registered Successfully')
     this.registerForm.reset()
     //this.router.navigate(['/users'])
    }); }
    else
    {
      alert('already Email exists')
      this.registerForm.reset()
    }
 }

// onSubmit(){
//   this.service.reg().subscribe(dt=>{
//     console.log("coming status::::"+dt.reg);
//   })
  //console.log(this.registerForm.value);
// }
}
