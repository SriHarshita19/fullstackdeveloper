import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './user/register/register.component';
import { LoginComponent } from './login/login.component';
import { ReactiveFormsModule, ControlContainer } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UsersComponent } from './users/users.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ServiceService } from './service.service';
//import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
//import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
import { ImportComponent } from './import/import.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
//import { ManageexchangesComponent } from './manageexchanges/manageexchanges.component';
import { UserLandingComponent } from './user-landing/user-landing.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { IpoComponent } from './ipo/ipo.component';
import { IpoaddComponent } from './ipoadd/ipoadd.component';
import { UpdateipoComponent } from './updateipo/updateipo.component';
import { StockComponent } from './stock/stock.component';
import { UpdatestockComponent } from './updatestock/updatestock.component';

import { ActivateComponent } from './activate/activate.component';
import { UpdatestockpriceComponent } from './updatestockprice/updatestockprice.component';
import { StockpriceComponent } from './stockprice/stockprice.component';
import { AddstockpriceComponent } from './addstockprice/addstockprice.component';

import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { CompanyComponent } from './company/company.component';



@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    AdminComponent,
    UsersComponent,
  //  AddnewcompanyComponent,
    //DeletecompanyComponent,
    UpdatecompanyComponent,
    ImportComponent,
    UpdateUserComponent,
    //ManageexchangesComponent,
    UserLandingComponent,
    StockexchangeComponent,
    IpoComponent,
    IpoaddComponent,
    UpdateipoComponent,
    StockComponent,
    UpdatestockComponent,
    
    ActivateComponent,
    
    UpdatestockpriceComponent,
    
    StockpriceComponent,
    
    AddstockpriceComponent,
    
    AddnewcompanyComponent,
    
    CompanyComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
