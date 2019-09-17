import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FinanzasPersonalesWeb';
  nombre = 'Rodriguez Pablo';
  edad = 7;
  email = 'rpablo@gmail.com';
  sueldos = [1700, 1600, 1900];
  activo = true;
  sitio='http://www.google.com';
  contador=1;
  art={codigo:null,
  descripcion:null,
  precio:null};

  articulos=[{codigo:1, descripcion:'papas', precio:10.55},
  {codigo:2, descripcion:'manzanas', precio:12.10},
  {codigo:3, descripcion:'melon', precio:52.30},
  {codigo:4, descripcion:'cebollas', precio:17},
  {codigo:5, descripcion:'calabaza', precio:20},
  ];

  esActivo() {
    if (this.activo)
      return 'Trabajador Activo';
    else
      return 'Trabajador Inactivo';
  }

  ultimos3Sueldos() {
    let suma=0;
    for(let x=0; x<this.sueldos.length; x++)
      suma+=this.sueldos[x];
    return suma;
  }
  incrementar(){
    this.contador++;
  }
  decrementar(){
    this.contador--;
  }

  hayElementos(){
    return this.articulos.length<=0?false:true;
  }

  borrar(art){
    for(let x=0;x<this.articulos.length;x++){
      if(this.articulos[x].codigo==art.codigo){
        this.articulos.splice(x,1);
        return;
      }
    }
  }

  agregar(){
    for(let x=0;x<this.articulos.length;x++){
      if(this.articulos[x].codigo==this.art.codigo){
        alert("ya existe un articulo con este codigo");
        return;
      }
    }
    this.articulos.push({codigo:this.art.codigo,
      descripcion:this.art.descripcion,precio:this.art.precio});
    this.art.codigo=null;
    this.art.descripcion=null;
    this.art.precio=null;
  }

  seleccionar(art){
    this.art.codigo=art.codigo;
    this.art.descripcion=art.descripcion;
    this.art.precio=art.precio;
  }

  modificar(art){
    for(let x=0;x<this.articulos.length;x++){
      if(this.articulos[x].codigo==art.codigo){
        this.articulos[x].codigo=art.codigo;
        this.articulos[x].descripcion=art.descripcion;
        this.articulos[x].precio=art.precio;
        return;
      }
    }
    alert('No existe el código de articulo ingresado');
  }

  dado1:number;
  dado2:number;
  dado3:number;
  resultado:string;
  girar(){
    this.dado1=Math.trunc(Math.random()*6);
    this.dado2=Math.trunc(Math.random()*6);
    this.dado3=Math.trunc(Math.random()*6);
    if (this.dado1==this.dado2 && this.dado1==this.dado3)    
      this.resultado='Ganó';
    else
      this.resultado='Perdió';
  }
}
