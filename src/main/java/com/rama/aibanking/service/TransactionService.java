package com.rama.aibanking.service;

import com.rama.aibanking.kafka.TransactionProducer;
import com.rama.aibanking.model.Transaction;
import com.rama.aibanking.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionProducer transactionProducer;

    public TransactionService(
            TransactionRepository transactionRepository,
            TransactionProducer transactionProducer) {

        this.transactionRepository = transactionRepository;
        this.transactionProducer = transactionProducer;
    }

    public Transaction createTransaction(Transaction transaction) {

        transaction.setTimestamp(LocalDateTime.now());

        if (transaction.getCategory() == null ||
                transaction.getCategory().isBlank()) {

            transaction.setCategory("UNCATEGORIZED");
        }

        Transaction savedTransaction =
                transactionRepository.save(transaction);

        transactionProducer.sendTransaction(savedTransaction);

        return savedTransaction;
    }

    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }
}