package com.example.demo2.services;

import com.example.demo2.entity.Profile;
import com.example.demo2.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private ProfileRepository repository;
    public ProfileService(ProfileRepository repository){
        this.repository=repository;
    }
    public List<Profile> getProfileList(){
        return this.repository.findAll();
    }

    public Profile createProfile(Profile newProfile){
        return this.repository.save(newProfile);
    }
}
