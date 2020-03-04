import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/service.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
  updateUser:FormGroup;
  constructor(private formBuilder:FormBuilder, private service: ServiceService,private router:Router) { }

  ngOnInit() {
    this.updateUser = this.formBuilder.group({
      id:[],
      username:['',Validators.required],
      firstname:['',Validators.required],
      lastname:['',Validators.required],
      email:['',[Validators.required, Validators.email]],
      phone:['',Validators.required],
      password:['',Validators.required]
    });
    const id=localStorage.getItem('userId');
    if(+id > 0){
      this.service.getUserById(+id).subscribe(user =>{
        this.updateUser.patchValue(user);
      });
     
    }
  }
updateTheUser(){
  this.service.updateUserInfo(this.updateUser.value).subscribe(u=>{
this.router.navigate(['users']);
  })
}
onSubmit(){
  console.log(this.updateUser.value );
}
}
