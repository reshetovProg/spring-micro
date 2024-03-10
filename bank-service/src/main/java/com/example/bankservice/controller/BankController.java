package com.example.bankservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
