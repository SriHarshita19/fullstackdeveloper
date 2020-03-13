import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StockpriceService } from '../stockprice.service';

@Component({
  selector: 'app-addstockprice',
  templateUrl: './addstockprice.component.html',
  styleUrls: ['./addstockprice.component.css']
})
export class AddstockpriceComponent implements OnInit {

    constructor(private formBuilder:FormBuilder,private stockpriceserv:StockpriceService) { }
    stockPriceForm:FormGroup;
    ngOnInit() {
      this.stockPriceForm = this.formBuilder.group({
        id:['',Validators.required],
        companyid:['',Validators.required],
        currentprice:['',Validators.required],
        opendatetime:['',Validators.required]
       
      });
    }
    adduser(){
      this.stockpriceserv.savePrice(this.stockPriceForm.value).subscribe(data =>{
        console.log('stockprice entered successfully');
      });
    }
    onSubmit(){
      console.log(this.stockPriceForm.value);
    }
  }