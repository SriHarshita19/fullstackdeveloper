import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  // @Input('appHighlight') color:"yellow";
  @Input() color:"yellow";
  constructor(private elementref:ElementRef) {
    //elementref.nativeElement.style.backgroundColor='gray';
   }

   @HostListener('mouseenter')
   addHighLigth(){
    this.elementref.nativeElement.style.backgroundColor=this.color;
   }

   @HostListener('mouseleave')
   removeHoghLight(){
    this.elementref.nativeElement.style.backgroundColor=null;
   }

  
}
