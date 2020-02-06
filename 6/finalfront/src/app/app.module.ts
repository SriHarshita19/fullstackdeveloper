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
import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
import { ImportComponent } from './import/import.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { ManagecompanyComponent } from './managecompany/managecompany.component';
import { ManageexchangesComponent } from './manageexchanges/manageexchanges.component';
import { UserLandingComponent } from './user-landing/user-landing.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    AdminComponent,
    UsersComponent,
    AddnewcompanyComponent,
    DeletecompanyComponent,
    UpdatecompanyComponent,
    ImportComponent,
    UpdateUserComponent,
    ManagecompanyComponent,
    ManageexchangesComponent,
    UserLandingComponent,
    StockexchangeComponent
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
