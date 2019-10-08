import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {
  valor1 = null;
  valor2 = null;
  resultado = null;
  operacionSeleccionada: string = 'suma';
  tipoOperaciones = [
    'suma',
    'resta',
    'multiplicacion',
    'division'
  ];
  constructor() { }

  ngOnInit() {
  }

  operar() {
    switch (this.operacionSeleccionada) {
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
        this.resultado = this.valor1 / this.valor2;
        break;
    }
  }
}
