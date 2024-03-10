package com.example.stockservice.services.impl;

import com.example.stockservice.entities.Order;
import com.example.stockservice.repositories.OrderRepository;
import com.example.stockservice.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    OrderRepository repository;
    @Override
    public Order reserveProduct(Order order) {
        return repository.save(order);
    }
}
