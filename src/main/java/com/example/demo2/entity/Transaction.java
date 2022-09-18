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
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name= "concept")
    private String concept;

    @Column(name= "amount")
    private float amount;

    @CreationTimestamp
    @Column(name = "updateAt")
    private Date updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Date createdAt;

//    public Transaction() {
//    }
//
//    public Transaction(long id, String concept, float amount, Employee employee, Enterprise enterprise, Date updateAt, Date createdAt) {
//        this.id = id;
//        this.concept = concept;
//        this.amount = amount;
//        this.employee = employee;
//        this.enterprise = enterprise;
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
//    public String getConcept() {
//        return concept;
//    }
//
//    public void setConcept(String concept) {
//        this.concept = concept;
//    }
//
//    public float getAmount() {
//        return amount;
//    }
//
//    public void setAmount(float amount) {
//        this.amount = amount;
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
//    public Enterprise getEnterprise() {
//        return enterprise;
//    }
//
//    public void setEnterprise(Enterprise enterprise) {
//        this.enterprise = enterprise;
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
