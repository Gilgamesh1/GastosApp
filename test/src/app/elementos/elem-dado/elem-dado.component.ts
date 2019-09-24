import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-elem-dado',
  templateUrl: './elem-dado.component.html',
  styleUrls: ['./elem-dado.component.css']
})
export class ElemDadoComponent implements OnInit {
  @Input() valor: number;
  constructor() { }

  ngOnInit() {
  }

}
