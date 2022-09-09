package com.example.demo2.controller;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/enterprise")
    private List<Enterprise> verEnterprise(){
        return enterpriseService.verEnterprise();
    }

    @PostMapping("/enterprise")
    private void crearYActualizarEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.crearYActualizarEnterprise(enterprise);
    }

    @DeleteMapping("enterprise/{id}")
    private void eliminarEnterprise(@PathVariable ("id") Long id){
        enterpriseService.eliminarEnterprise(id);
    }

    @PutMapping("/enterprise")
    private  void  editarEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.crearYActualizarEnterprise(enterprise);
    }


}


