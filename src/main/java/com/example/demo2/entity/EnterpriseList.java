package com.example.demo2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnterpriseList {
    private String name;
    private List<Enterprise> enterpriseList;

    public EnterpriseList(String name) { //constructor solo para name
        this.name = name;
        this.enterpriseList = new ArrayList<Enterprise>(); //inicializar variable employeeList
    }
    //crear otro metodo para agregar una empleado a la lista
    public void addEnterpiseList(Enterprise enterprise){
        this.enterpriseList.add(enterprise);
    }
    public List<Enterprise> getEnterpriseList(){
        return this.enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeEnterptise(String name){
        this.enterpriseList = enterpriseList.stream().filter(t->{//función lambda
            return !t.getName().equals(name);
        }).collect(Collectors.toList());
    }

    public void printEnteprise(){
        this.enterpriseList.forEach(enterprise->{
            System.out.println("Id: ");
            System.out.println(enterprise.getId());
            System.out.println("Name: ");
            System.out.println(enterprise.getName());
            System.out.println("Document: ");
            System.out.println(enterprise.getDocument());
            System.out.println("Phone: ");
            System.out.println(enterprise.getPhone());
            System.out.println("Employee: ");
            System.out.println(enterprise.getEmployee());
            System.out.println("Transaccion: ");
            System.out.println(enterprise.getTransaction());
            System.out.println("Fecha Creacion: ");
            System.out.println(enterprise.getCreatedAt());
            System.out.println("Fecha Actualizacion: ");
            System.out.println(enterprise.getUpdateAt());
        });
    }
}
