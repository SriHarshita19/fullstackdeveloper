import { Component, OnInit, Input, Inject} from '@angular/core';
import { BlogPost } from '../blog-post';
import { TruncatePipe } from '../truncate.pipe';

@Component({
  selector: 'app-blog-post-tile',
  templateUrl: './blog-post-tile.component.html',
  styleUrls: ['./blog-post-tile.component.css']
  
})
export class BlogPostTileComponent implements OnInit {

  @Input() post:BlogPost;
  fullSummary:string;
  temp:boolean=true;
  constructor(@Inject(TruncatePipe) private trpipe) { }

  ngOnInit() {       
      this.fullSummary=this.post.summary 
      this.post.summary= this.trpipe.transform(this.post.summary,30);  
  }

  
  toggleFav(){
    this.post.isFav=!this.post.isFav;
  }
  
    showFullSummary(){
      if(this.temp)
      {
      this.post.summary=this.fullSummary
      }
      else{
        this.post.summary= this.trpipe.transform(this.post.summary,30);        
      }
      this.temp=!this.temp      
    }   

}
