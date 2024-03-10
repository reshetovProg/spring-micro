package com.example.shopservice.client;

import com.example.shopservice.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StockServiceClient {
    @Autowired
    private RestTemplate template;

    public ProductDTO fetchGetProduct(Long id){
        return template.getForObject("http://localhost:8765/stock/check-product/"+ id, ProductDTO.class);
    }


}
