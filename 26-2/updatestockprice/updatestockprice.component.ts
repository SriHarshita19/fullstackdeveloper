import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockpriceService } from '../stockprice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatestockprice',
  templateUrl: './updatestockprice.component.html',
  styleUrls: ['./updatestockprice.component.css']
})
export class UpdatestockpriceComponent implements OnInit {

  
    UpdateStockPrice:FormGroup;
    constructor(private formBuilder:FormBuilder, private stockpriceservice: StockpriceService,private router:Router) { }
    ngOnInit() {
      this.UpdateStockPrice = this.formBuilder.group({
        id:['',Validators.required],
        companyid:['',Validators.required],
        currentprice:['',Validators.required],
        opendatetime:['',Validators.required],
       
      });
      const id=localStorage.getItem("stockpriceId");
      if(+id > 0){
        this.stockpriceservice.getPriceById(+id).subscribe(prices =>{
          this.UpdateStockPrice.patchValue(prices);
        });
    }
    }
    updateThePrice(){
      this.stockpriceservice.updatePriceInfo(this.UpdateStockPrice.value).subscribe(u=>{
    this.router.navigate(['/stockprice']);
      })
    }
    onSubmit(){
      console.log(this.UpdateStockPrice.value);
    
      }
  }
