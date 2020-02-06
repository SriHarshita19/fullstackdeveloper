import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageexchangesComponent } from './manageexchanges.component';

describe('ManageexchangesComponent', () => {
  let component: ManageexchangesComponent;
  let fixture: ComponentFixture<ManageexchangesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManageexchangesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageexchangesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
