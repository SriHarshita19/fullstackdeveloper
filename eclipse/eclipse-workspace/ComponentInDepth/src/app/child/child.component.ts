import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {


  @Input('parentdata')  name:string;
  @Output() public childEvent=new EventEmitter();

  constructor() { }

  ngOnInit() { }

  fireevent(){
    this.childEvent.emit("Message from child");    
  }

  hello()
  {
    console.log("fun in child..")
  }
}
