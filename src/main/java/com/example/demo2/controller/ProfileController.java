package com.example.demo2.controller;

import com.example.demo2.entity.Profile;
import com.example.demo2.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfileController {

    @Autowired
    ProfileService profileservices;

    @GetMapping("/profile")
    public String seeProfile(Model model){
        model.addAttribute("Profile", profileservices.seeProfile());
        return "profile";
    }

    @GetMapping("/add-profile")
    private String seeFormProfile(Profile profile){
        return "add-profile";
    }

    @PostMapping("/profile")
    private String createProfile(Profile profile){
        profileservices.createAndUpdateProfile(profile);
        return "redirect:/profile";
    }

    @GetMapping("/profile/delete/{id}")
    private String deleteProfile(@PathVariable("id") Long id){
        profileservices.deleteProfile(id);
        return "redirect:/profile";
    }

    @GetMapping("/profile/edit/{id}")
    private String seeProfileForId(@PathVariable("id") Long id, Model model){
        Profile profile = profileservices.seeProfileForId(id);
        model.addAttribute("profile", profile);
        return "update-profile";
    }

    @PostMapping("/profile/update/{id}")
    private String editProfile(@PathVariable("id") Long id, Profile profile){
        profileservices.createAndUpdateProfile(profile);
        return "redirect:/profile";
    }
}


