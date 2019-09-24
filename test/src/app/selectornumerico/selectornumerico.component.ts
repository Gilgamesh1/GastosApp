import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-selectornumerico',
  templateUrl: './selectornumerico.component.html',
  styleUrls: ['./selectornumerico.component.css']
})
export class SelectornumericoComponent implements OnInit {
@Input() minimo:number;
@Input() maximo:number;
actual:number;

  constructor() { }

  ngOnInit() {
    this.actual=this.minimo;
  }

  incrementar(){
    console.log("incrementar");
    if(this.actual<this.maximo)
      this.actual++;
  }

  decrementar(){
    console.log("decrementar");
    if(this.actual>this.minimo)
      this.actual--;
  }

  fijar(v:number){
    console.log("fijar");
    if(v>=this.minimo && v<=this.maximo)
      this.actual=v;
  }
}
