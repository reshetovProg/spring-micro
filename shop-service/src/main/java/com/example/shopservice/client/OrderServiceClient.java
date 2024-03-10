package com.example.shopservice.client;

import com.example.shopservice.dto.OrderDTO;
import com.example.shopservice.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderServiceClient {
    @Autowired
    private RestTemplate template;
    // к сожалению не успел дописать (здесь хотел реализовать запрос на получение заказа для
    // дальнейшего резервирования товара и оплаты
//    public OrderDTO fetchGetProduct(ProductDTO product, UserDTO userDTO){
//        OrderDTO orderDTO= OrderDTO.builder().
//                userId().build()
//        return template.postForObject("http://localhost:8765/stock/reserve-product",)
//    }
}
