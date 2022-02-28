package com.carvajal.app.listadeseos.service;

import com.carvajal.app.listadeseos.model.ProductModel;

import java.util.List;

public interface ProductService
{
    List<ProductModel> getAll();

    List<ProductModel> findALlByClientIdentification(String id);

    ProductModel save(ProductModel product);
}
