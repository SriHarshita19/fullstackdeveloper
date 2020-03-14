import { Component, OnInit, Inject } from '@angular/core';
import { FormGroup, FormControl,FormBuilder,Validators } from '@angular/forms';
import { BlogDadaService } from '../blog-dada.service';
//import { FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-reacttest',
  templateUrl: './reacttest.component.html',
  styleUrls: ['./reacttest.component.css']
})
export class ReacttestComponent implements OnInit {

  name:string="Abc";
  myid:string="Myid";
  //isDisabled:boolean=true;
  isDisabled:string="false";
  data;
  constructor(private fb: FormBuilder,@Inject(BlogDadaService) private ser) {}

  ngOnInit() {}

  registrationForm= this.fb.group({
    userName:[,[Validators.required,Validators.minLength(5)]],
    pwd:[''],
    cpwd:[''],
    age:[,[Validators.required,Validators.pattern('[0-9]*'),Validators.min(20),
          Validators.max(60)]],
    address:this.fb.group({
      city:[''],
      state:[''],
      postalcode:['']
    })
  })
  /*
  registraionForm=new FormGroup({
    userName: new FormControl('Iqbal'),
    pwd: new FormControl(''),
    cpwd: new FormControl(''),

    address: new  FormGroup({
      city: new FormControl(''),
      state: new FormControl(''),
      postalcode: new FormControl('')
    })
  });
*/

funregister(){
  if(this.registrationForm.invalid)
  alert("Invalid")
  else
  alert("Valid..")
}
  //in case of setValue() function it is compulsary to set all the values of the form
  //otherwise error will be there
  //
loadApiData(){
   this.ser.getMydata.subscribe(dt=>{
    this.data=dt;
   })
     // this.registrationForm.patchValue({
  //   userName:'bc',
  //   pwd:'kjj',
  //   cpwd:'jkj'
  // });
}

}
