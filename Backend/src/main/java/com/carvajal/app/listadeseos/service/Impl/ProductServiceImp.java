package com.carvajal.app.listadeseos.service.Impl;

import com.carvajal.app.listadeseos.model.ProductModel;
import com.carvajal.app.listadeseos.repository.ProductRepository;
import com.carvajal.app.listadeseos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService
{
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductModel> getAll() {
        return (List<ProductModel>) productRepository.findAll();
    }

    @Override
    public List<ProductModel> findALlByClientIdentification(String identification) {
        return productRepository.findAllByClientIdentification(identification);
    }

    @Override
    public ProductModel save(ProductModel product) {
        return productRepository.save(product);
    }
}
