import { Component, OnInit } from '@angular/core';
import { UploadserviceService } from '../uploadservice.service';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-admin-user',
  templateUrl: './admin-user.component.html',
  styleUrls: ['./admin-user.component.css']
})
export class AdminUserComponent implements OnInit {
isAdmin:boolean

  constructor(private userserviceservice:ServiceService) { 
    this.isAdmin=userserviceservice.isAdmin();
  }

  ngOnInit() {
  }

}
