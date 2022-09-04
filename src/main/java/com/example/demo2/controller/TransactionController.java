package com.example.demo2.controller;

import com.example.demo2.entity.Profile;
import com.example.demo2.entity.Transaction;
import com.example.demo2.services.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    TransactionService services;

    public TransactionController(TransactionService services){
        this.services=services;
    }

    @GetMapping("/transaction")
    public List<Transaction> TransactionList(){
        return this.services.getTransactionList();
    }

    @PostMapping("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return this.services.createTransaction(transaction);
    }
}
