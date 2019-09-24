import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-dado',
  templateUrl: './dado.component.html',
  styleUrls: ['./dado.component.css']
})
export class DadoComponent implements OnInit {
  valor:number;
  @Input() dado1:number;
  @Input() dado2:number;
  @Input() dado3:number;
  constructor() { }

  ngOnInit() {
    this.valor=Math.trunc(Math.random()*6);
  }

}
