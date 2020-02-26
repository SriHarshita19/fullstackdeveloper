import { Component, OnInit } from '@angular/core';
import { StockpriceService } from '../stockprice.service';
import { Router } from '@angular/router';
import { StockPrice } from '../models/price';

@Component({
  selector: 'app-stockprice',
  templateUrl: './stockprice.component.html',
  styleUrls: ['./stockprice.component.css']
})
export class StockpriceComponent implements OnInit {

  
    constructor(private stockpriceserv:StockpriceService,private router:Router) { }
    stockprice:StockPrice[];
    ngOnInit() {
      this.stockpriceserv.getAllPrice().subscribe(data =>{
        this.stockprice=data;
      });
    }
    deletePrice(prices:StockPrice){
      this.stockpriceserv.deletePrice(prices.id).subscribe();
      this.stockprice=this.stockprice.filter(u=>u!==prices);
    }
    updatePrice(prices:StockPrice){
      localStorage.removeItem('stockpriceId');
    localStorage.setItem('stockpriceId',prices.id.toString());
    this.router.navigate(['updatestockprice'])
      }
  }
