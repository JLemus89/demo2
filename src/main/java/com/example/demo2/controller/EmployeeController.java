package com.example.demo2.controller;

import com.example.demo2.entity.Employee;
import com.example.demo2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeServices;

    @GetMapping("/employee")
    public String seeEmployee(Model model){
        model.addAttribute("employee", employeeServices.seeEmployee());
        return "employee";
    }

    @GetMapping("/add-employee")
    private String seeFormEmployee(Employee employee){
        return "add-employee";
    }

    @PostMapping("/employee")
    private String createEmployee(Employee employee){
        employeeServices.createAndUpdateEmployee(employee);
        return "redirect:/employee";
    }

    @GetMapping("/employee/delete/{id}")
    private String deleteEmployee(@PathVariable("id") Long id){
        employeeServices.deleteEmployee(id);
        return "redirect:/employee";
    }

    @GetMapping("/employee/edit/{id}")
    private String seeEmployeeForId(@PathVariable("id") Long id, Model model){
        Employee employee = employeeServices.seeEmployeeForId(id);
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    @PostMapping("/employee/update/{id}")
    private String editEmployee(@PathVariable("id") Long id, Employee employee){
        employeeServices.createAndUpdateEmployee(employee);
        return "redirect:/employee";
    }
}
