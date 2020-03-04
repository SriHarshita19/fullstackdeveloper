import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { PlaceorderComponent } from './placeorder/placeorder.component';
import { GiftcardsComponent } from './giftcards/giftcards.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
{path:'contactus',component:ContactusComponent},
{path:'placeorder',component:PlaceorderComponent},
{path:'giftcards',component:GiftcardsComponent},
{path:'home',component:HomeComponent}
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
