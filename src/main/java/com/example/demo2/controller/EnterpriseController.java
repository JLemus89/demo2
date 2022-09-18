package com.example.demo2.controller;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/enterprise")
    public String seeEnterprise(Model model){
        model.addAttribute("Enterprises", enterpriseService.seeEnterprise());
        return "enterprise";
    }

    @GetMapping("/add-enterprise")
    private String seeFormEnterprise(Enterprise enterprise){
        return "add-enterprise";
    }

    @PostMapping("/enterprise")
    private String createEnterprise(Enterprise enterprise){
        enterpriseService.createAndUpdateEnterprise(enterprise);
        return "redirect:/enterprise";
    }

    @GetMapping("/enterprise/delete/{id}")
    private String deleteEnterprise(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
        return "redirect:/enterprise";
    }

    @GetMapping("/enterprise/edit/{id}")
    private String seeEnterpriseForId(@PathVariable("id") Long id, Model model){
        Enterprise enterprise = enterpriseService.seeEnterpriseForId(id);
        model.addAttribute("enterprise", enterprise);
        return "update-enterprise";
    }

    @PostMapping("/enterprise/update/{id}")
    private String editEnterprise(@PathVariable("id") Long id, Enterprise enterprise){
        enterpriseService.createAndUpdateEnterprise(enterprise);
        return "redirect:/enterprise";
    }
}


