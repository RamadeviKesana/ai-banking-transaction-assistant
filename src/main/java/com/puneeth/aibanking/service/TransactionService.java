package com.rama.aibanking.service;

import com.rama.aibanking.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {

    private final List<Transaction> transactions = new ArrayList<>();

    public Transaction createTransaction(Transaction transaction) {
        transaction.setId(UUID.randomUUID());
        transaction.setTimestamp(LocalDateTime.now());

        if (transaction.getCategory() == null || transaction.getCategory().isBlank()) {
            transaction.setCategory("UNCATEGORIZED");
        }

        transactions.add(transaction);
        return transaction;
    }

    public List<Transaction> getTransactions() {
        return List.copyOf(transactions);
    }
}
