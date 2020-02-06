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
    });
  }
  onSubmit(){
    console.log(this.registerForm.value);

}
}
