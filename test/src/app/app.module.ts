import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { DadoComponent } from './dado/dado.component';
import { CronometroComponent } from './cronometro/cronometro.component';
import { SelectornumericoComponent } from './selectornumerico/selectornumerico.component';
import { Selectornumerico2Component } from './selectornumerico2/selectornumerico2.component';
import { ListadoarticulosComponent } from './listadoarticulos/listadoarticulos.component';
import { ElementosModule } from './elementos/elementos.module';
import { HttpClientModule } from '@angular/common/http';
import { JuegodadosComponent } from './juegodados/juegodados.component';
import { AcercadeComponent } from './acercade/acercade.component';

@NgModule({
  declarations: [
    AppComponent,
    DadoComponent,
    CronometroComponent,
    SelectornumericoComponent,
    Selectornumerico2Component,
    ListadoarticulosComponent,
    JuegodadosComponent,
    AcercadeComponent
  ],
  imports: [
    BrowserModule, FormsModule,
    ElementosModule, HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
