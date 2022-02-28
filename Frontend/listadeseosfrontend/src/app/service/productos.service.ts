import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient, HttpParams} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProductosService {

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any>
  {
    let params = new HttpParams();

    return this.http.get("http://localhost:8080/carvajal/api/services/products/get",
    {
      params: params
    });
  }


}
