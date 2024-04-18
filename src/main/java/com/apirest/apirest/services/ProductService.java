package com.apirest.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.apirest.models.ProductModel;
import com.apirest.apirest.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    
    public List<ProductModel> getAllProducts(){
        return (List<ProductModel>) productRepository.findAll();
    }
    public ProductModel addProduct(ProductModel producto){
        return productRepository.save(producto);
    }
}
