package com.example.demo2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProfileList {
    private String image;
    private List<Profile> profileList;

    public ProfileList(String image) { //constructor solo para name
        this.image = image;
        this.profileList = new ArrayList<Profile>(); //inicializar variable employeeList
    }
    //crear otro metodo para agregar una empleado a la lista
    public void addProfileList(Profile profile){
        this.profileList.add(profile);
    }
    public List<Profile> getProfileList(){
        return this.profileList;
    }

    public void setProfileList(List<Profile> profileList) {
        this.profileList = profileList;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void removeProfile(String image){
        this.profileList = profileList.stream().filter(t->{//función lambda
            return !t.getImage().equals(image);
        }).collect(Collectors.toList());
    }

    public void printProfile(){
        this.profileList.forEach(profile->{
            System.out.println("id: ");
            System.out.println(profile.getId());
            System.out.println("image: ");
            System.out.println(profile.getImage());
            System.out.println("phone: ");
            System.out.println(profile.getPhone());
            System.out.println("Employee: ");
            System.out.println(profile.getEmployee());
            System.out.println("Fecha Creacion: ");
            System.out.println(profile.getCreatedAt());
            System.out.println("Fecha Actualizacion: ");
            System.out.println(profile.getUpdateAt());
        });
    }
}
