package com.example.stockservice.services;

import com.example.stockservice.entities.Order;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderService {
    public Order reserveProduct(Order order);
}
