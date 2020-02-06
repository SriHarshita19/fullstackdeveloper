import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './user/register/register.component';
import { UsersComponent } from './users/users.component';
import { AdminComponent } from './admin/admin.component';
import { ImportComponent } from './import/import.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { ManagecompanyComponent } from './managecompany/managecompany.component';
import { ManageexchangesComponent } from './manageexchanges/manageexchanges.component';
import {UserLandingComponent} from './user-landing/user-landing.component';
const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'users', component: UsersComponent },
  { path: 'admin', component: AdminComponent },
  {path:'import',component:ImportComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  {path:'addnewcompany',component:AddnewcompanyComponent},
  {path:'deletecompany',component:DeletecompanyComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'managecompany',component:ManagecompanyComponent},
  {path:'manageexchanges',component:ManageexchangesComponent},
  {path:'user-landing',component:UserLandingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
