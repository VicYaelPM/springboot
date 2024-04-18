package com.apirest.apirest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.models.ProductModel;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductController productController;

    @GetMapping("/getAllProducts")
    public ArrayList<ProductModel> getProducts() {
        return productController.getProducts();
    }
    
    @PostMapping()
    public ProductModel postProduct(@RequestBody ProductModel product) {
        return productController.postProduct(product);
    }
}
