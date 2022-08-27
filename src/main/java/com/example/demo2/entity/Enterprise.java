package com.example.demo2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Enterprise {

    @Id
    private long id;

    @ManyToOne
    private Employee employee;


}
