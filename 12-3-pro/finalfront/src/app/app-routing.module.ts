import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './user/register/register.component';
import { UsersComponent } from './users/users.component';
import { AdminComponent } from './admin/admin.component';
import { ImportComponent } from './import/import.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
//import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
//import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { AddnewcompanyComponent} from './addnewcompany/addnewcompany.component';
import {CompanyComponent} from './company/company.component';
//import { ManageexchangesComponent } from './manageexchanges/manageexchanges.component';
import {UserLandingComponent} from './user-landing/user-landing.component';
import { IpoComponent } from './ipo/ipo.component';
import { UpdateipoComponent } from './updateipo/updateipo.component';
import { IpoaddComponent} from './ipoadd/ipoadd.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { StockComponent } from './stock/stock.component';
import { UpdatestockComponent } from './updatestock/updatestock.component';
// import { AddstockpriceComponent} from './addstockprice/addstockprice.component';
// import { StockpriceComponent } from './stockprice/stockprice.component';
// import { UpdatestockpriceComponent } from './updatestockprice/updatestockprice.component';
import { ActivateComponent} from './activate/activate.component';
import { HighchartsComponent } from './highcharts/highcharts.component';
import { ComparesectorComponent } from './comparesector/comparesector.component';
import { AdminUserComponent } from './admin-user/admin-user.component';
import { LogoutComponent } from './logout/logout.component';
import { UserprofileComponent } from './user/userprofile/userprofile.component';
import { ChangepasswordComponent } from './user/userprofile/changepassword/changepassword.component';
import {UpdateprofileComponent} from './user/userprofile/updateprofile/updateprofile.component';
import { ComparecompanyComponent } from './comparecompany/comparecompany.component';


const routes: Routes = [
  
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'users', component: UsersComponent },
  { path: 'admin', component: AdminComponent },
  {path:'import',component:ImportComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  //{path:'addnewcompany',component:AddnewcompanyComponent},
  //{path:'deletecompany',component:DeletecompanyComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'addnewcompany',component:AddnewcompanyComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  //{path:'manageexchanges',component:ManageexchangesComponent},
  {path:'user-landing',component:UserLandingComponent},
  {path:'updateipo',component:UpdateipoComponent},
  {path:'ipoadd',component:IpoaddComponent},
  {path:'ipo',component:IpoComponent},
  {path:'stockexchange',component:StockexchangeComponent},
  {path:'stock',component:StockComponent},
  {path:'updatestock',component:UpdatestockComponent},
//  {path:'addstockprice',component:AddstockpriceComponent},
  {path:'company',component:CompanyComponent},
 // {path:'stockprice',component:StockpriceComponent},
//  {path:'updatestockprice',component:UpdatestockpriceComponent},
  {path:'activate',component:ActivateComponent},
  {path:'highcharts',component:HighchartsComponent},
  {path:'comparesector',component:ComparesectorComponent},
  {path:'admin-user',component:AdminUserComponent},
  {path:'logout',component:LogoutComponent},
  {path:'userprofile',component:UserprofileComponent},
  {path:'changepassword',component:ChangepasswordComponent},
  {path:'updateprofile',component:UpdateprofileComponent},
  {path:'comparecompany',component:ComparecompanyComponent},

  { path: '', component: HomeComponent },

  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
