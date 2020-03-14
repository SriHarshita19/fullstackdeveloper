import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CompanyService } from '../company.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addnewcompany',
  templateUrl: './addnewcompany.component.html',
  styleUrls: ['./addnewcompany.component.css']
})
export class AddnewcompanyComponent implements OnInit {

  addnewCompany:FormGroup;
  constructor(private formBuilder:FormBuilder, private companyservice: CompanyService,private router:Router) { }
  ngOnInit() {
    this.addnewCompany = this.formBuilder.group({
      id:[],
      companyname:['',Validators.required],
      ceoname:['',Validators.required],
      sector:['',Validators.required],
      turnover:['',Validators.required],
      bod:['',Validators.required],
      companyCode:['',Validators.required]
    });
    const id=localStorage.getItem("companyId");
    if(+id > 0){
      this.companyservice.getCompaniesById(+id).subscribe(compan =>{
        this.addnewCompany.patchValue(compan);
      });
  }
}
adduser(){
  this.companyservice.saveCompanies(this.addnewCompany.value).subscribe(u=>{
this.router.navigate(['/company']);
  })
}
onSubmit(){
  console.log(this.addnewCompany.value );
}
}