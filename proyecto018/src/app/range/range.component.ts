import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-range',
  templateUrl: './range.component.html',
  styleUrls: ['./range.component.css']
})
export class RangeComponent implements OnInit {
  slider1 = 0;
  slider2 = 0;
  slider3 = 0;
  suma = 0;

  constructor() { }

  ngOnInit() {
  }

  cambiar() {
    this.suma = this.slider1 + this.slider2 + this.slider3;
  }
}
