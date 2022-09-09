package com.example.demo2.controller;

import com.example.demo2.entity.Employee;

import com.example.demo2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeServices;

    @GetMapping("/employee")
    private List<Employee> verEmployee(){
        return employeeServices.verEmployee();
    }

    @PostMapping("/employee")
    private void crearYActualizarEmployee(@RequestBody Employee employee){
        employeeServices.crearYActualizarEmployee(employee);
    }

    @DeleteMapping("employee/{id}")
    private void eliminarEmployee(@PathVariable ("id") Long id){
        employeeServices.eliminarEmployee(id);
    }

    @PutMapping("/employee")
    private  void  editarEmployee(@RequestBody Employee employee){
        employeeServices.crearYActualizarEmployee(employee);
    }

}
