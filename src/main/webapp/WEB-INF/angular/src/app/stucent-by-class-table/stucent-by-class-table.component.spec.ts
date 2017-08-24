import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StucentByClassTableComponent } from './stucent-by-class-table.component';

describe('StucentByClassTableComponent', () => {
  let component: StucentByClassTableComponent;
  let fixture: ComponentFixture<StucentByClassTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StucentByClassTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StucentByClassTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
