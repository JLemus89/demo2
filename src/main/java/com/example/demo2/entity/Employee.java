package com.example.demo2.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(unique = true, name= "email")
    private String email;

    @JoinColumn(name = "enterprise")
    @ManyToOne
    private Enterprise enterprise;

    @JoinColumn(name = "profile")
    @OneToOne
    private Profile profile;

    @JoinColumn(name = "transaction")
    @ManyToOne
    private Transaction transaction;

    @Enumerated(EnumType.STRING)
    @Column(name = "Enum_RolName")
    private Enum_RolName Enum_RolName;


    @Column(name = "updateAt")
    private Date updateAt;
    @Column(name = "createdAt")
    private Date createdAt;


    public Employee(long id, String email, Enterprise enterprise, Profile profile, Transaction transaction, com.example.demo2.entity.Enum_RolName enum_RolName, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.profile = profile;
        this.transaction = transaction;
        Enum_RolName = enum_RolName;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public com.example.demo2.entity.Enum_RolName getEnum_RolName() {
        return Enum_RolName;
    }

    public void setEnum_RolName(com.example.demo2.entity.Enum_RolName enum_RolName) {
        Enum_RolName = enum_RolName;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
