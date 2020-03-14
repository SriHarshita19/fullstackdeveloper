import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BlogPostTileComponent } from './blog-post-tile/blog-post-tile.component';
import { BlogListComponent } from './blog-list/blog-list.component';
import { ReacttestComponent } from './reacttest/reacttest.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { ParentComponent } from './parent/parent.component';


const routes: Routes = [  
  { path:"bloglist",component:BlogListComponent },
  { path:"react",component:ReacttestComponent},
  { path:"template",component:TemplatedrivenComponent },
  { path:"parent",component:ParentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
