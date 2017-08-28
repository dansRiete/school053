import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentsDropdownComponent } from './parents-dropdown.component';

describe('ParentsDropdownComponent', () => {
  let component: ParentsDropdownComponent;
  let fixture: ComponentFixture<ParentsDropdownComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentsDropdownComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentsDropdownComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
