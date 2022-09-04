package com.example.demo2.services;

import com.example.demo2.entity.Transaction;
import com.example.demo2.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository repository;
    public TransactionService(TransactionRepository repository){
        this.repository=repository;
    }
    public List<Transaction> getTransactionList(){
        return this.repository.findAll();
    }

    public Transaction createTransaction(Transaction newProfile){
        return this.repository.save(newProfile);
    }
}
