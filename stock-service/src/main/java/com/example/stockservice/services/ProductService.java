package com.example.stockservice.services;

import com.example.stockservice.entities.Product;

import java.util.Optional;

public interface ProductService {
    public Optional<Product> getProduct(Long id);
}
