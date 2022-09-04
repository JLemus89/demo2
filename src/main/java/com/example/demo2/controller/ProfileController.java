package com.example.demo2.controller;

import com.example.demo2.entity.Profile;
import com.example.demo2.services.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    ProfileService services;

    public ProfileController(ProfileService services){
        this.services=services;
    }

    @GetMapping("/profile")
    public List<Profile> ProfileList(){
        return this.services.getProfileList();
    }

    @PostMapping("/profile")
    public Profile createProfile(@RequestBody Profile profile){
        return this.services.createProfile(profile);
    }
}
