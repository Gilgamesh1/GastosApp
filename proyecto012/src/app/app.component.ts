import { Component } from '@angular/core';
import { ArticulosService } from './articulos.service';
import { ArticulosWebService } from './articulos-web.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'proyecto012';
  articulos=null;
  articulosWeb=null;
  nombre = 'Juan Carlos';
  saldo =12.15;
  dias = ['domingo','lunes','martes','miércoles','jueves','viernes','sábado'];
  fechaActual = new Date();
  vector = [1,2,3,4,5,6,7];
  
  constructor (private articulosServicio:ArticulosService,
    private articulosService:ArticulosWebService){
  }
  ngOnInit(): void {
    this.articulos=this.articulosServicio.retornar();
    this.articulosService.retornar()
    .subscribe(result=>this.articulosWeb=result);
  }
}
