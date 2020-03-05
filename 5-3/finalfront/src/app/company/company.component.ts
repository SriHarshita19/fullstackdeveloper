import { Component, OnInit } from '@angular/core';
import { CompanyService } from '../company.service';
import { Router } from '@angular/router';
import { Company } from '../models/company';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {

  constructor(private companyserv:CompanyService,private router:Router) { }
  com:Company[];
  ngOnInit() {
    this.companyserv.getAllCompanies().subscribe(data =>{
      this.com=data;
    });
  }
  deleteCompanies(compan:Company){
    this.companyserv.deleteCompanies(compan.id).subscribe();
    this.com=this.com.filter(u=>u!==compan);
  }
  updateCompanies(compan:Company){
   // localStorage.removeItem('companyId');
  localStorage.setItem('companyId',compan.id.toString());
  this.router.navigate(['updatecompany'])
    }
  }