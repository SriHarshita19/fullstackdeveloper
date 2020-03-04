import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, FormBuilder, Validators} from '@angular/forms';
import { ServiceService } from 'src/app/service.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private service:ServiceService) { }
  registerForm:FormGroup;
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
  }

  adduser(){
    this.service.saveUser(this.registerForm.value).subscribe(data =>{
      console.log('user entered successfully');
      if(data.res==0){
        alert("User Already Avaialable");
      }
         else if(data.res==1){
          console.log("User Details are Entered Success fully");
          alert("Added New User");
        }
        else{
          alert("ERROR");
        }
    });
  }

onSubmit(){
  this.service.reg().subscribe(data=>
    {
    console.log("coming status::::"+data.reg);
  })
}
}
