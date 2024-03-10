package com.example.stockservice.controller;

import com.example.stockservice.entities.Order;
import com.example.stockservice.entities.Product;
import com.example.stockservice.exceptions.ProductNotFoundException;
import com.example.stockservice.services.OrderService;
import com.example.stockservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/stock")

public class StockController {

    private final ProductService productService;
    private final OrderService orderService;

    @GetMapping("/check-product/{id}")
    public Boolean checkProduct(@PathVariable Long id) {
        return productService.checkProduct(id);
    }

    @PostMapping("/reserve-product")
    public Order reserveProduct(@RequestBody Order order) {
        if (productService.checkProduct(order.getProductId().getId()))
            return orderService.reserveProduct(order);
        else{
            throw new ProductNotFoundException("product with id "+ order.getProductId().getId() + " is out of stock");
        }
    }
}