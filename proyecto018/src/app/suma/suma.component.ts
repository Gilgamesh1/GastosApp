import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-suma',
  templateUrl: './suma.component.html',
  styleUrls: ['./suma.component.css']
})
export class SumaComponent implements OnInit {

  valor1 = 0;
  valor2 = 0;
  resultado = 0;

  constructor() { }

  ngOnInit() {
  }

  sumar() {
    this.resultado = this.valor1 + this.valor2;
  }
}
