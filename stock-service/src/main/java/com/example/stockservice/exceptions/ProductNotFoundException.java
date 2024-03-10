package com.example.stockservice.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
        super(message);
    }
}
