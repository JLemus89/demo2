package com.example.demo2.controller;


import com.example.demo2.entity.Enterprise;
import com.example.demo2.entity.Transaction;
import com.example.demo2.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/transaction")
    public String seeTransaction(Model model){
        model.addAttribute("Transaction", transactionService.seeTransaction());
        return "transaction";
    }

    @GetMapping("/add-transaction")
    private String seeFormTransaction(Transaction transaction){
        return "add-transaction";
    }

    @PostMapping("/transaction")
    private String createTransaction(Transaction transaction){
        transactionService.createAndUpdateTransaction(transaction);
        return "redirect:/transaction";
    }

    @GetMapping("/transaction/delete/{id}")
    private String deleteTransaction(@PathVariable("id") Long id){
        transactionService.deleteTransaction(id);
        return "redirect:/transaction";
    }

    @GetMapping("/transaction/edit/{id}")
    private String seeTransactionForId(@PathVariable("id") Long id, Model model){
        Transaction transaction = transactionService.seeTransactionForId(id);
        model.addAttribute("transaction", transaction);
        return "update-transaction";
    }

    @PostMapping("/transaction/update/{id}")
    private String editTransaction(@PathVariable("id") Long id, Transaction transaction){
        transactionService.createAndUpdateTransaction(transaction);
        return "redirect:/transaction";
    }
}

