package com.example.shopservice.controller;


import com.example.shopservice.dto.ProductDTO;
import com.example.shopservice.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/shop")
public class ShopController {

    ShopService service;

    @GetMapping("/find-product/{id}")
    public ProductDTO findProduct(@PathVariable Long id) {
        return service.getProduct(id);
    }
    /*
    @PostMapping("buy-product")
    public void buyProduct(@RequestBody OrderDTO order) {


    }
    */

}
