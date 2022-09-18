package com.example.demo2.services;

import com.example.demo2.entity.Employee;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.repositories.EmployeeRepository;
import com.example.demo2.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void createAndUpdateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> seeEmployee(){
        return employeeRepository.findAll();
    }

    public Employee seeEmployeeForId(Long id){
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
