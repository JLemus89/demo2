package com.example.demo2.controller;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.entity.Profile;
import com.example.demo2.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileservices;

    @GetMapping("/profile")
    private List<Profile> verProfile(){
        return profileservices.verProfile();
    }

    @PostMapping("/profile")
    private void crearYActualizarProfile(@RequestBody Profile profile){
        profileservices.crearYActualizarProfile(profile);
    }

    @DeleteMapping("profile/{id}")
    private void eliminarProfile(@PathVariable ("id") Long id){
        profileservices.eliminarProfile(id);
    }

    @PutMapping("/profile")
    private  void  editarProfile(@RequestBody Profile profile){
        profileservices.crearYActualizarProfile(profile);
    }




}
