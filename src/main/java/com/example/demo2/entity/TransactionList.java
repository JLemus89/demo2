package com.example.demo2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionList {
    private String concept;
    private List<Transaction> transactionList;

    public TransactionList(String concept) { //constructor solo para name
        this.concept = concept;
        this.transactionList = new ArrayList<Transaction>(); //inicializar variable employeeList
    }
    //crear otro metodo para agregar una empleado a la lista
    public void addTransactionList(Transaction transaction){
        this.transactionList.add(transaction);
    }
    public List<Transaction> getTransactionList(){
        return this.transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public void removeTransaction(String concept){
        this.transactionList = transactionList.stream().filter(t->{//función lambda
            return !t.getConcept().equals(concept);
        }).collect(Collectors.toList());
    }

    public void printTransaction(){
        this.transactionList.forEach(transaction->{
            System.out.println("id: ");
            System.out.println(transaction.getId());
            System.out.println("concept: ");
            System.out.println(transaction.getConcept());
            System.out.println("amount : ");
            System.out.println(transaction.getAmount());
            System.out.println("Employee: ");
            System.out.println(transaction.getEmployee());
            System.out.println("Enterprise: ");
            System.out.println(transaction.getEnterprise());
            System.out.println("Fecha Actualizacion: ");
            System.out.println(transaction.getUpdateAt());
            System.out.println("Fecha Creacion: ");
            System.out.println(transaction.getCreatedAt());
        });
    }
}
