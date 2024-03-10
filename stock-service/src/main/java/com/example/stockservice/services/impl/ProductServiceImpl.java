package com.example.stockservice.services.impl;

import com.example.stockservice.entities.Product;
import com.example.stockservice.repositories.ProductRepository;
import com.example.stockservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    ProductRepository repository;
    @Override
    public Optional<Product> getProduct(Long id) {
        return Optional.ofNullable(repository.findById(id).orElse(null));
    }
}
