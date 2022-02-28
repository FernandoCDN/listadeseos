package com.carvajal.app.listadeseos.controller;

import com.carvajal.app.listadeseos.model.ProductModel;
import com.carvajal.app.listadeseos.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/products/")
public class ProductController
{
    @Autowired
    ProductService productService;

    @GetMapping("/get")
    private ResponseEntity<List<ProductModel>> getAllproducts()
    {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/AllByClientIdentification")
    private ResponseEntity<List<ProductModel>> getAllProductsbyClient(@RequestParam String id)
    {
        return ResponseEntity.ok(productService.findALlByClientIdentification(id));
    }

    @PostMapping("/save")
    @ApiOperation("save product")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product)
    {
        ProductModel productSaved = productService.save(product);
        return new ResponseEntity<>(productSaved, HttpStatus.OK);
    }
}
