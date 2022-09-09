package com.example.demo2.services;

import com.example.demo2.entity.Enterprise;
import com.example.demo2.entity.Profile;
import com.example.demo2.repositories.EnterpriseRepository;
import com.example.demo2.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public void crearYActualizarProfile(Profile profile){
        profileRepository.save(profile);
    }

    public List<Profile> verProfile(){
        List<Profile> profiles = new ArrayList<>();
        profiles.addAll(profileRepository.findAll());
        return profiles;

    }

    public void eliminarProfile(Long id){
        profileRepository.deleteById(id);
    }



}
