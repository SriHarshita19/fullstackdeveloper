import { Component, OnInit, QueryList, ViewChildren } from '@angular/core';
import { ChildComponent } from '../child/child.component';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  pdata:string="HELLO I AM PARENT"
  msg:string;
  @ViewChildren("child")    childcomps: QueryList<ChildComponent>
  constructor() { }

  ngOnInit() {
  }

  onOutput(ob){
    this.msg=ob;    
    console.log("emitted.."+ob);
  }

  callChildCompFun(){
    this.childcomps.forEach(pc => {
      pc.hello();      
    });
  }

}
