package com.apirest.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}
