import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ElemDadoComponent } from './elem-dado/elem-dado.component';

@NgModule({
  declarations: [ElemDadoComponent],
  imports: [
    CommonModule
  ],
  exports:[ElemDadoComponent]
})
export class ElementosModule { }
