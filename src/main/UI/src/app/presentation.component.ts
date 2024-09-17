import { Component, OnInit } from '@angular/core';
import { TimeService } from './time.service';

@Component({
  selector: 'app-presentation',
  templateUrl: './presentation.component.html',
//   styleUrls: ['./presentation.component.css']
})
export class PresentationComponent implements OnInit {

  presentationTimes!: string;

  constructor(private timeService: TimeService) { }

  ngOnInit(): void {
    this.timeService.getPresentationTimes().subscribe(times => {
      this.presentationTimes = times;
    });
  }
}
