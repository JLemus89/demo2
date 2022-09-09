package com.example.demo2.services;


import com.example.demo2.entity.Enterprise;
import com.example.demo2.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EnterpriseService {

    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void crearYActualizarEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }

    public List<Enterprise> verEnterprise(){
        List<Enterprise> enterprises = new ArrayList<>();
        enterprises.addAll(enterpriseRepository.findAll());
        return enterprises;

    }

    public void eliminarEnterprise(Long id){
        enterpriseRepository.deleteById(id);
    }



}
