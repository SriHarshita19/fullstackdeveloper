import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IpoaddComponent } from './ipoadd.component';

describe('IpoaddComponent', () => {
  let component: IpoaddComponent;
  let fixture: ComponentFixture<IpoaddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IpoaddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IpoaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
