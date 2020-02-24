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
import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { ManagecompanyComponent } from './managecompany/managecompany.component';
import { ManageexchangesComponent } from './manageexchanges/manageexchanges.component';
import {UserLandingComponent} from './user-landing/user-landing.component';
import { IpoComponent } from './ipo/ipo.component';
import { UpdateipoComponent } from './updateipo/updateipo.component';
import { IpoaddComponent} from './ipoadd/ipoadd.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { StockComponent } from './stock/stock.component';
import { UpdatestockComponent } from './updatestock/updatestock.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'users', component: UsersComponent },
  { path: 'admin', component: AdminComponent },
  {path:'import',component:ImportComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  //{path:'addnewcompany',component:AddnewcompanyComponent},
  {path:'deletecompany',component:DeletecompanyComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'managecompany',component:ManagecompanyComponent},
  {path:'manageexchanges',component:ManageexchangesComponent},
  {path:'user-landing',component:UserLandingComponent},
  {path:'updateipo',component:UpdateipoComponent},
  {path:'ipoadd',component:IpoaddComponent},
  {path:'ipo',component:IpoComponent},
  {path:'stockexchange',component:StockexchangeComponent},
  {path:'stock',component:StockComponent},
  {path:'updatestock',component:UpdatestockComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
