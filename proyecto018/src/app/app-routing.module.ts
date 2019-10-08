import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Pais1Component } from './pais1/pais1.component';
import { Pais2Component } from './pais2/pais2.component';
import { Pais3Component } from './pais3/pais3.component';
import { SumaComponent } from './suma/suma.component';
import { TictacComponent } from './tictac/tictac.component';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import { CalculadoraCheckComponent } from './calculadora-check/calculadora-check.component';
import { CalculadoraSelectComponent } from './calculadora-select/calculadora-select.component';
import { RangeComponent } from './range/range.component';
import { SlideToggleComponent } from './slide-toggle/slide-toggle.component';
import { TabComponent } from './tab/tab.component';

const routes: Routes = [
  {
    path: 'pais1',
    component: Pais1Component
  }, {
    path: 'pais2',
    component: Pais2Component
  }, {
    path: 'pais3',
    component: Pais3Component
  },{
    path:'suma',
    component: SumaComponent
  },{
    path:'tictac',
    component: TictacComponent
  },{
    path:'calculadora',
    component: CalculadoraComponent
  },{
    path:'calculadoraCheck',
    component: CalculadoraCheckComponent
  },{
    path:'calculadoraSelect',
    component: CalculadoraSelectComponent
  },{
    path:'slide',
    component: RangeComponent
  },{
    path:'slideToggle',
    component: SlideToggleComponent
  },{
    path:'tab',
    component: TabComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
