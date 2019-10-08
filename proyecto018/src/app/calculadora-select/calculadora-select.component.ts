import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadora-select',
  templateUrl: './calculadora-select.component.html',
  styleUrls: ['./calculadora-select.component.css']
})
export class CalculadoraSelectComponent implements OnInit {
  valor1 = null;
  valor2 = null;
  resultado = null;
  operaciones = [
    { valor: 'suma', muestraValor: 'Sumar' },
    { valor: 'resta', muestraValor: 'Restar' },
    { valor: 'multiplicacion', muestraValor: 'Multiplicar' },
    { valor: 'division', muestraValor: 'Dividir' }
  ];
  seleccionada: string = this.operaciones[0].valor;

  constructor() { }

  ngOnInit() {
  }

  operar() {
    switch (this.seleccionada) {
      case 'suma':
        this.resultado = this.valor1 + this.valor2;
        break;
      case 'resta':
        this.resultado = this.valor1 - this.valor2;
        break;
      case 'multiplicacion':
        this.resultado = this.valor1 * this.valor2;
        break;
      case 'division':
        this.resultado = this.valor1 / +this.valor2;
        break;
    }
  }
}
