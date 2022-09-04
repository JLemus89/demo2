package com.example.demo2.controller;

import com.example.demo2.entity.Employee;
import com.example.demo2.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService services;

    public EmployeeController(EmployeeService services){
        this.services=services;
    }

    @GetMapping ("/employee")
    public List<Employee> EmployeeList(){
        return this.services.getEmployeeList();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.services.createEmployee(employee);
    }


}
