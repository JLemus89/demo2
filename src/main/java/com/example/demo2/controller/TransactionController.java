package com.example.demo2.controller;


import com.example.demo2.entity.Transaction;
import com.example.demo2.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @GetMapping("/transaction")
    private List<Transaction> verTransaction(){
        return transactionService.verTransaction();
    }

//    @PostMapping("/transaction")
//    private void crearYActualizarTransaction(@RequestBody Transaction transaction){
//        transactionService.crearYActualizarTransaction(transaction);
//    }

    @DeleteMapping("transaction/{id}")
    private void eliminarTransaction(@PathVariable ("id") Long id){
        transactionService.eliminarTransaction(id);
    }

//    @PutMapping("/transaction")
//    private  void  editarTransaction(@RequestBody Transaction transaction){
//        transactionService.crearYActualizarTransaction(transaction);
//    }

    @GetMapping
    private void createTasnsaction(@RequestBody Transaction transaction){
        transactionService.createTasnsaction(transaction);
    }

}
