package com.example.bankservice.service.impl;

import com.example.bankservice.entity.Wallet;
import com.example.bankservice.repository.BankRepository;
import com.example.bankservice.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    @Override
    public Optional<Wallet> checkBalance(Integer id) {
        return bankRepository.findById(id);
    }

    @Override
    public String getMoney(Integer id, float money) {
        return id+" successfully transfered "+money;
    }
}
