package com.example.demo2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    private String email;
    private List<Employee> employeeList;

    public EmployeeList(String email) { //constructor solo para name
        this.email = email;
        this.employeeList = new ArrayList<Employee>(); //inicializar variable employeeList
    }
    //crear otro metodo para agregar una empleado a la lista
    public void addEmployeeList(Employee employee){
        this.employeeList.add(employee);
    }
    public List<Employee> getEmployeeList(){
        return this.employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void removeEmployee(String email){
        this.employeeList = employeeList.stream().filter(t->{//función lambda
            return !t.getEmail().equals(email);
        }).collect(Collectors.toList());
    }

    public void printEmployee(){
        this.employeeList.forEach(employee->{
            System.out.println("Id: ");
            System.out.println(employee.getId());
            System.out.println("correo: ");
            System.out.println(employee.getEmail());
            System.out.println("Enterprise: ");
            System.out.println(employee.getEnterprise());
            System.out.println("Perfil: ");
            System.out.println(employee.getProfile());
            System.out.println("Transaccion: ");
            System.out.println(employee.getTransaction());
            System.out.println("Fecha Creacion: ");
            System.out.println(employee.getCreatedAt());
            System.out.println("Fecha Actualizacion: ");
            System.out.println(employee.getUpdateAt());
        });
    }
}
