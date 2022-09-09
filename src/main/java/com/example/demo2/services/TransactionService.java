package com.example.demo2.services;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.entity.Transaction;
import com.example.demo2.repositories.EnterpriseRepository;
import com.example.demo2.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public void crearYActualizarTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public List<Transaction> verTransaction(){
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(transactionRepository.findAll());
        return transactions;

    }

    public void eliminarTransaction(Long id){
        transactionRepository.deleteById(id);
    }

}
