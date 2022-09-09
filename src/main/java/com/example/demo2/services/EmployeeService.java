package com.example.demo2.services;

import com.example.demo2.entity.Employee;

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

    public void crearYActualizarEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> verEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.addAll(employeeRepository.findAll());
        return employees;

    }

    public void eliminarEmployee(Long id){
        employeeRepository.deleteById(id);
    }


}
