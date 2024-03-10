package com.example.bankservice.repository;

import com.example.bankservice.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Wallet, Integer> {
}
