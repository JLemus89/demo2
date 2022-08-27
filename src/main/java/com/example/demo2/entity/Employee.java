package com.example.demo2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id
    private long id;

    @Column(unique = true)
    private String email;

    @ManyToOne
    private Enterprise enterprise;

    @OneToOne
    private Profile profile;

    @ManyToOne
    private Transaction transaction;



    private Date updateAt;
    private Date createdAt;

    public Employee() {

    }

    public Employee(long id, String email, Enterprise enterprise, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }


}
