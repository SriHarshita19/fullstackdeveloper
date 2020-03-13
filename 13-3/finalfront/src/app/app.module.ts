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
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
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
// import { UpdatestockpriceComponent } from './updatestockprice/updatestockprice.component';
// import { StockpriceComponent } from './stockprice/stockprice.component';
// import { AddstockpriceComponent } from './addstockprice/addstockprice.component';

import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { CompanyComponent } from './company/company.component';
import { HighchartsComponent } from './highcharts/highcharts.component';
import { HighchartsChartComponent } from 'highcharts-angular';
import { ComparesectorComponent } from './comparesector/comparesector.component';
import { HttpInterseptorService } from './http-interseptor.service';
import { AdminUserComponent } from './admin-user/admin-user.component';
import { LogoutComponent } from './logout/logout.component';
import { UserprofileComponent } from './user/userprofile/userprofile.component';
import { ChangepasswordComponent } from './user/userprofile/changepassword/changepassword.component';
import { UpdateprofileComponent } from './user/userprofile/updateprofile/updateprofile.component';
import { ComparecompanyComponent } from './comparecompany/comparecompany.component';


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
    
    // UpdatestockpriceComponent,
    
    // StockpriceComponent,
    
    // AddstockpriceComponent,
    
    AddnewcompanyComponent,
    
    CompanyComponent,
    
    HighchartsComponent,
    HighchartsChartComponent,
    ComparesectorComponent,
    AdminUserComponent,
    LogoutComponent,
    UserprofileComponent,
    ChangepasswordComponent,
    UpdateprofileComponent,
    ComparecompanyComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    {
      provide:HTTP_INTERCEPTORS,
      useClass:HttpInterseptorService,
      multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
