package com.rama.aibanking.kafka;

import com.rama.aibanking.model.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    @KafkaListener(
            topics = "transaction-created",
            groupId = "transaction-analysis-group"
    )
    public void consume(Transaction transaction) {

        System.out.println("Kafka message received:");
        System.out.println("Transaction ID: " + transaction.getId());
        System.out.println("Account ID: " + transaction.getAccountId());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Merchant: " + transaction.getMerchant());
        System.out.println("Category: " + transaction.getCategory());
        System.out.println("-----------------------------");
    }
}