import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CompanyService } from '../company.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatecompany',
  templateUrl: './updatecompany.component.html',
  styleUrls: ['./updatecompany.component.css']
})
export class UpdatecompanyComponent implements OnInit {

  updateCompanyForm:FormGroup;
  constructor(private formBuilder:FormBuilder, private companyservice: CompanyService,private router:Router) { }
  ngOnInit() {
    this.updateCompanyForm = this.formBuilder.group({
      id:[],
      companyname:['',Validators.required],
      ceoname:['',Validators.required],
      sector:['',Validators.required],
      turnover:['',Validators.required],
      bod:['',Validators.required],
      companyCode:['',Validators.required]
    });
    const id=localStorage.getItem("companyId");
    console.log("updateCompany::"+id)
    if(+id > 0){
      this.companyservice.getCompaniesById(+id).subscribe(compan =>{
        this.updateCompanyForm.patchValue(compan);
      });
  }
}
updateTheCompany(){
  this.companyservice.updateCompaniesInfo(this.updateCompanyForm.value).subscribe(u=>{
this.router.navigate(['/company']);
  })
}
onSubmit(){
  console.log(this.updateCompanyForm.value );
}
}
