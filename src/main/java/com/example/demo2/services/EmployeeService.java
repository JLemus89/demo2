package com.example.demo2.services;

import com.example.demo2.entity.Employee;

import com.example.demo2.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repository;
    public EmployeeService(EmployeeRepository repository){
        this.repository=repository;
    }

    public List<Employee> getEmployeeList(){
        return this.repository.findAll();
    }

    public Employee createEmployee(Employee newEmployee){
        return this.repository.save(newEmployee);
    }
}
