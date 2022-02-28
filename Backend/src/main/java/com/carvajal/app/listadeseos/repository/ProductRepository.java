package com.carvajal.app.listadeseos.repository;

import com.carvajal.app.listadeseos.model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel,Long>
{

    List<ProductModel> findAllByClientIdentification(String identification);
}
