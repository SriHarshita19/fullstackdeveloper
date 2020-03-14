import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-stockexchange',
  templateUrl: './stockexchange.component.html',
  styleUrls: ['./stockexchange.component.css']
})
export class StockexchangeComponent implements OnInit {

  

    constructor(private formBuilder:FormBuilder,private stockserv:StockService) { }
    stockExchangeForm:FormGroup;
    ngOnInit() {
      this.stockExchangeForm = this.formBuilder.group({
        id:['',Validators.required],
        stockexchange:['',Validators.required],
        brief:['',Validators.required],
        contactaddress:['',Validators.required],
        remarks:['',Validators.required]
        
      });
    }
  
    adduser(){
      this.stockserv.saveStock(this.stockExchangeForm.value).subscribe(data =>{
        console.log('stock entered successfully');
      });
    }
    onSubmit(){
      console.log(this.stockExchangeForm.value);
  
  
    
    }
  
  }
  