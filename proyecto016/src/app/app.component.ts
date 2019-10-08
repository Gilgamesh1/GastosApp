import { Component, OnInit } from '@angular/core';
import { ArticulosService } from './articulos.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'proyecto016';
  articulos=null;
  art={
    codigo:null,
    descripcion:null,
    precio:null
  }

  constructor (private articulosServicio:ArticulosService)
  {}

  ngOnInit(){
    this.recuperarTodos();
  }
  
  recuperarTodos(){
    this.articulosServicio.recuperarTodos().subscribe(
      result=>this.articulos=result
    );
  }

  alta(articulo) {
    this.articulosServicio.alta(this.art).subscribe(
      datos=>{
        if(datos['resultado']=='OK'){
          alert(datos['mensaje']);
          this.recuperarTodos();
        }
      }
    );
  }

  baja(codigo:number) {
    this.articulosServicio.baja(codigo).subscribe(datos=>{
      if(datos['resultado']=='OK'){
        alert(datos['mensaje']);
        this.recuperarTodos();
      }
    });
  }

  modificacion(articulo) {
    this.articulosServicio.modificar(this.art).subscribe(datos=>{
      if(datos['resultado']=='OK'){
        alert(datos['mensaje']);
        this.recuperarTodos();
      }
    }
    );
  } 
  
  seleccionar(codigo:number) {
    this.articulosServicio.seleccionar(codigo).subscribe(
      result=>this.art=result[0]
    );
  }

  hayRegistros(){
    return true;
  }
}