package com.example.demo2.services;

import com.example.demo2.entity.Transaction;
import com.example.demo2.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public void createAndUpdateTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public List<Transaction> seeTransaction(){
        return transactionRepository.findAll();
    }

    public Transaction seeTransactionForId(Long id){
        return transactionRepository.findById(id).get();
    }

    public void deleteTransaction(Long id){
        transactionRepository.deleteById(id);
    }
}
