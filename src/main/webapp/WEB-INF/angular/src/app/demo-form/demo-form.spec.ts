import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoFormWithValidationsExplicitComponent } from './demo-form';

describe('DemoFormWithValidationsExplicitComponent', () => {
  let component: DemoFormWithValidationsExplicitComponent;
  let fixture: ComponentFixture<DemoFormWithValidationsExplicitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DemoFormWithValidationsExplicitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoFormWithValidationsExplicitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
