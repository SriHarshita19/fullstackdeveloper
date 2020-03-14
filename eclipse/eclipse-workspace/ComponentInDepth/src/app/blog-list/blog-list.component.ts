import { Component, OnInit, ViewChild, QueryList, ViewChildren, Inject } from '@angular/core';
import { BlogPost } from '../blog-post';
import { BlogPostTileComponent } from '../blog-post-tile/blog-post-tile.component';
import { BlogDadaService } from '../blog-dada.service';

@Component({
  selector: 'app-blog-list',
  templateUrl: './blog-list.component.html',
  styleUrls: ['./blog-list.component.css']
})
export class BlogListComponent implements OnInit {

  blogposts:BlogPost[][];
  currentPage:number;
  isFavClicked:boolean=true;
  data;data2;
  cid:number;
  @ViewChildren('tile') blogPostTileCompnents:QueryList<BlogPostTileComponent>
  constructor(@Inject(BlogDadaService)private ser) { }

  getdatafromboot()
  {
    this.ser.getDataFromBoot().subscribe(dt=>{
      this.data=dt;
    })
    //alert("data"+this.data);
  }

  getalldata(){
    let name="Iqbal";
    this.ser.getTotalData().subscribe(dt=>{
      this.data2=dt
    })
  }

  getdataById(){
    this.ser.getdatabyId(this.cid).subscribe(dt=>{
      this.data=dt
    })
  }

  deletdataById(custid){
    //alert(custid)
    this.ser.deletedatabyId(custid).subscribe(dt=>{
      this.data=dt
      this.getalldata();
      })      
  }

 updateDataById(){
  var id=7
   var obj={email:"aaaa@aaa",name:"aaaa"}
    this.ser.updatedatabyId(obj,id).subscribe(dt=>{
      alert("result "+dt);
  })
  
}

saveCustData(){
  var custdt={email:"hhh@hhh",name:"hhh"}
  this.ser.saveData(custdt).subscribe(dt=>{
    alert("Data save.."+dt)
  })
}
  


  expandAll(){
    this.blogPostTileCompnents.forEach(e=>e.showFullSummary());
  }

  favAll(){

   // this.blogposts[this.currentPage].forEach(post=>post.isFav=true )
   if(this.isFavClicked)
   this.blogposts[this.currentPage].forEach(post=>post.isFav=true )
    else
    this.blogposts[this.currentPage].forEach(post=>post.isFav=false )
    this.isFavClicked=!this.isFavClicked    
  }

  updatPage(newPage){
    console.log("event emitted..")
    this.currentPage=newPage;
  }

  ngOnInit() {
   // this.blogposts.push(new BlogPost("Blog Post 1","Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."));
   // this.blogposts.push(new BlogPost("Blog Post 2","Find out which posts are a hit with Blogger’s built-in analytics. You’ll see where your audience is coming from and what they’re interested in. You can even connect your blog directly to Google Analytics for a more detailed look."));
    this.currentPage=0;   
    this.blogposts=this.ser.getData();
  }

}
