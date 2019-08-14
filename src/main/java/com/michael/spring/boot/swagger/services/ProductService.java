package com.michael.spring.boot.swagger.services;

import com.michael.spring.boot.swagger.domain.Product;



public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
