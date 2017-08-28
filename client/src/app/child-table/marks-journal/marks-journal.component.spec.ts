import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MarksJournalComponent } from './marks-journal.component';

describe('MarksJournalComponent', () => {
  let component: MarksJournalComponent;
  let fixture: ComponentFixture<MarksJournalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MarksJournalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MarksJournalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
