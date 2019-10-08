import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadora-check',
  templateUrl: './calculadora-check.component.html',
  styleUrls: ['./calculadora-check.component.css']
})
export class CalculadoraCheckComponent implements OnInit {
  valor1 = null;
  valor2 = null;
  resultado = null;
  opcion1 = false;
  opcion2 = false;
  opcion3 = false;
  opcion4 = false;

  constructor() { }

  ngOnInit() {
  }

  operar() {
    this.resultado = '';
    if (this.opcion1) {
      let ope = this.valor1 + this.valor2;
      this.resultado += ` La suma es ${ope}`;
    }
    if (this.opcion2) {
      let ope = this.valor1 - this.valor2;
      this.resultado += ` La resta es ${ope}`;
    }
    if (this.opcion3) {
      let ope = this.valor1 * this.valor2;
      this.resultado += ` El producto es ${ope}`;
    }
    if (this.opcion4) {
      let ope = this.valor1 / this.valor2;
      this.resultado += ` La division es ${ope}`;
    }
  }
}
