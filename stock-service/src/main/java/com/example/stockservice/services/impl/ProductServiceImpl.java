package com.example.stockservice.services.impl;

import com.example.stockservice.repositories.ProductRepository;
import com.example.stockservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    ProductRepository repository;
    @Override
    public Boolean checkProduct(Long id) {
        return repository.existsById(id);
    }
}
