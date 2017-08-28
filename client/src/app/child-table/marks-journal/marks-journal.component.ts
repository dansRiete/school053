import { Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-marks-journal',
  templateUrl: './marks-journal.component.html',
  styleUrls: ['./marks-journal.component.css']
})
export class MarksJournalComponent implements OnInit {

  @Input() childId: String;

  constructor() {

  }

  ngOnInit() {
  }

}
