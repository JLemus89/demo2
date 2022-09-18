package com.example.demo2.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name= "image")
    private String image;

    @Column(name= "phone")
    private String phone;

    @JoinColumn(name = "employee")
    @OneToOne
    private Employee employee;

    @CreationTimestamp
    @Column(name = "updateAt")
    private Date updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Date createdAt;

//    public Profile() {
//
//    }
//
//    public Profile(long id, String image, String phone, Employee employee, Date updateAt, Date createdAt) {
//        this.id = id;
//        this.image = image;
//        this.phone = phone;
//        this.employee = employee;
//        this.updateAt = updateAt;
//        this.createdAt = createdAt;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public Date getUpdateAt() {
//        return updateAt;
//    }
//
//    public void setUpdateAt(Date updateAt) {
//        this.updateAt = updateAt;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
}
