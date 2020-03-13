import { Component } from '@angular/core';
import { AuthServiceService } from './auth-service.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project';
  userLoggedIn : boolean = false;
  constructor(private authService:AuthServiceService){}
  ngDoCheck(){
    this.userLoggedIn = this.authService.isUserLoggedIn();
  }
}
  

