import { Component, OnInit } from '@angular/core';
import { IpoService } from '../ipo.service';
import { Router } from '@angular/router';
import { Ipo } from '../models/ipo';

@Component({
  selector: 'app-ipoadd',
  templateUrl: './ipoadd.component.html',
  styleUrls: ['./ipoadd.component.css']
})
export class IpoaddComponent implements OnInit {

  

    constructor(private iposerv:IpoService,private router:Router) { }
    ipo:Ipo[];
    ngOnInit() {
      this.iposerv.getAllIPO().subscribe(data =>{
        this.ipo=data;
      });
    }
    deleteIPO(ipos:Ipo){
      this.iposerv.deleteIPO(ipos.id).subscribe();
      this.ipo=this.ipo.filter(u=>u!==ipos);
    }
    updateIPO(ipos:Ipo){
      localStorage.removeItem('ipoId');
    localStorage.setItem('ipoId',ipos.id.toString());
    this.router.navigate(['updateipo'])
      }
  }
