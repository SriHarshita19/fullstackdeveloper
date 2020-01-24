import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mock-heroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})

export class HeroesComponent implements OnInit {

  heroes = HEROES;
  selectedHero: Hero;
  message='hello from child';

 @Output() childMessage=new EventEmitter<string>();
 
  constructor() { }


  ngOnInit() {
    this.childMessage.emit(this.message);
  }

  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }
}