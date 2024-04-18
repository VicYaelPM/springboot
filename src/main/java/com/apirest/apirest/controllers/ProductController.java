package com.apirest.apirest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.models.ProductModel;
import com.apirest.apirest.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getAllProducts")
    public ArrayList<ProductModel> getProducts() {
        return (ArrayList<ProductModel>) productService.getAllProducts();
    }
    
    @PostMapping("/postProduct")
    public ProductModel postProduct(@RequestBody ProductModel product) {
        return productService.addProduct(product);
    }
}
