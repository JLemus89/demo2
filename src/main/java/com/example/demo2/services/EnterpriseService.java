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

    public void createAndUpdateEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }

    public List<Enterprise> seeEnterprise(){
        return enterpriseRepository.findAll();
    }

    public Enterprise seeEnterpriseForId(Long id){
        return enterpriseRepository.findById(id).get();
    }

    public void deleteEnterprise(Long id){
        enterpriseRepository.deleteById(id);
    }
}
