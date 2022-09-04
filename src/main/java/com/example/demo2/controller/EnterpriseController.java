package com.example.demo2.controller;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.entity.EnterpriseList;
import com.example.demo2.services.EnterpriseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {

    EnterpriseService services;

    public EnterpriseController(EnterpriseService services){
        this.services=services;
    }

    @GetMapping("/enterprise")
    public List<Enterprise> EnterpriseList(){
        return this.services.getEnterpriseList();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return this.services.createEnterprise(enterprise);
    }
}
