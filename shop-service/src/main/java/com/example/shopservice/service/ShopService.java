package com.example.shopservice.service;

import com.example.shopservice.client.StockServiceClient;
import com.example.shopservice.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShopService {

    private StockServiceClient stockServiceClient;

    public ProductDTO getProduct(Long id){
        return stockServiceClient.fetchGetProduct(id);
    }

    public void buyProduct(Long id){

    }

}
