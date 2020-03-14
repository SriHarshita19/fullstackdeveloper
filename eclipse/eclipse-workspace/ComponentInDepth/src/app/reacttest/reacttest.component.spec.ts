import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReacttestComponent } from './reacttest.component';

describe('ReacttestComponent', () => {
  let component: ReacttestComponent;
  let fixture: ComponentFixture<ReacttestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReacttestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReacttestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
