import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-manageexchanges',
  templateUrl: './manageexchanges.component.html',
  styleUrls: ['./manageexchanges.component.css']
})
export class ManageexchangesComponent implements OnInit {
  manageexchangeForm:FormGroup
  manageexchangescomponent: any;
  submit()
{
  console.log(this.manageexchangescomponent.value);
}

  constructor(private formBuilder:FormBuilder) { }

  ngOnInit() {
    this.manageexchangeForm=this.formBuilder.group({
      id:['',Validators.required],
      username:['',Validators.required],
      brief:['',Validators.required],
      contactaddress:['',Validators.required],
      remarks:['',Validators.required]
    });
  }

}
