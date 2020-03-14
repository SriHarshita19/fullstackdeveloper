import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-paginator',
  templateUrl: './paginator.component.html',
  styleUrls: ['./paginator.component.css']
})
export class PaginatorComponent implements OnInit {

  @Input() noOfPages;
  @Output() pageNumberClick= new EventEmitter<number>();
  pages: number[];
  constructor() { }

  ngOnInit() {
    this.pages=new Array(this.noOfPages);
  }
  
  pageNumberClicked(pageNo){
    this.pageNumberClick.emit(pageNo);
  }
}
