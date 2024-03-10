package com.example.bankservice.service;

import com.example.bankservice.entity.Wallet;

import java.util.Optional;

public interface BankService {
    Optional<Wallet> checkBalance(Integer id);
    String getMoney(Integer id, float money);

}
