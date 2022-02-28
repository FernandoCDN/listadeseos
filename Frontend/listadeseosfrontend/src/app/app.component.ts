import { Component } from '@angular/core';
import { ProductosService } from './service/productos.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'listadeseosfrontend';
  Data: any;

  constructor(public productsService: ProductosService)
  {

  }

  ngOnInit()
  {
    this.productsService.getAllProducts().subscribe(data =>
      {
        this.Data = data;
        console.log(this.Data)
      }
    );
  }

}
