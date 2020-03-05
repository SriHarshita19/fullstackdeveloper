import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Stock } from '../models/stock';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {

    constructor(private stockserv:StockService,private router:Router) { }
    stock:Stock[];
    
      ngOnInit() {
        this.stockserv.getAllStock().subscribe(data =>{
          this.stock=data;
        });
      
    }
    deleteStock(stocks:Stock){
      this.stockserv.deleteStock(stocks.id).subscribe();
      this.stock=this.stock.filter(u=>u!==stocks);
    }
    updateStock(stocks:Stock){
      localStorage.removeItem('stockId');
    localStorage.setItem('stockId',stocks.id.toString());
    this.router.navigate(['updatestock'])
      }
  
  }
