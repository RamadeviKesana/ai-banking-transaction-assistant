package com.rama.aibanking.repository;

import com.rama.aibanking.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository
        extends JpaRepository<Transaction, UUID> {
}