import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-selectornumerico2',
  templateUrl: './selectornumerico2.component.html',
  styleUrls: ['./selectornumerico2.component.css']
})
export class Selectornumerico2Component implements OnInit {
  @Input() minimo: number;
  @Input() maximo: number;
  actual: number;

  constructor() { }

  ngOnInit() {
    this.actual = this.minimo;
  }

  incrementar2() {
    console.log("incrementar2");
    if (this.actual<this.maximo)
      this.actual++;
  }

  decrementar2() {
    console.log("decrementar2");
    if (this.actual>this.minimo)
      this.actual--;
  }  

  fijar2(v:number) {
    console.log("fijar2");
    if (v>=this.minimo && v<=this.maximo)
      this.actual=v;
  }

}
