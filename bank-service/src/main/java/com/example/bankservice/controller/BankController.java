package com.example.bankservice.controller;

import com.example.bankservice.entity.Wallet;
import com.example.bankservice.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/bank")

public class BankController {

    private final BankService service;

    @GetMapping("/check-balance/{id}")
    public Optional<Wallet> checkBalance(@PathVariable Integer id) {
        return service.checkBalance(id);
    }

    @GetMapping("get-money/{id},{money}")
    public String getMoney(@PathVariable Integer id,
                           @PathVariable float money) {
        return service.getMoney(id, money);
    }
}
