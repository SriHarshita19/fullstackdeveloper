import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-updatestock',
  templateUrl: './updatestock.component.html',
  styleUrls: ['./updatestock.component.css']
})
export class UpdatestockComponent implements OnInit {

    updateStock:FormGroup;
    constructor(private formBuilder:FormBuilder, private stockservice: StockService,private router:Router) { }
  
    ngOnInit() {
      this.updateStock = this.formBuilder.group({
        id:[],
        stockexchange:['',Validators.required],
        brief:['',Validators.required],
        contactaddress:['',Validators.required],
        remarks:['',Validators.required]
        
        
  
      });
      const id=localStorage.getItem("stockId");
      if(+id > 0){
        this.stockservice.getStockById(+id).subscribe(stocks =>{
          this.updateStock.patchValue(stocks);
        });
    }
  
  }
  updateTheStock(){
    this.stockservice.updateStockInfo(this.updateStock.value).subscribe(u=>{
  this.router.navigate(['/stock']);
    })
  }
  onSubmit(){
    console.log(this.updateStock.value);
  
    }
  
  }
  