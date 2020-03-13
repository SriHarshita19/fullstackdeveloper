import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { Company } from '../models/company';
import { Router } from '@angular/router';
import { CompanyService } from '../company.service';

@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparecompanyComponent implements OnInit {

  companyData:FormGroup;
  companies: Company[];
  
  constructor(private formBuilder:FormBuilder,private router:Router, private companyService:CompanyService) { }
  ngOnInit() {
    this.companyData=this.formBuilder.group({
      csselect: ['',Validators.required],
      seselect: ['',Validators.required],
      cnsn: ['',Validators.required],
      ctcnsn: ['',Validators.required],
      fperiod: ['',Validators.required],
      tperiod: ['',Validators.required],
     });
     this.companyService.getAllCompanies().subscribe(data=>{
      this.companies=data;
    });
  }
  onSubmit() {
    this.router.navigate(["/highcharts"],{
      queryParams:{
        formData: JSON.stringify(this.companyData.value)
      }
    });
  }
}
