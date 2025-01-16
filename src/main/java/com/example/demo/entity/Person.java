package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAdress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id:'" + id + ",\n" +
            "name:'" + name + ",\n" +
            "phoneNumber:'" + phoneNumber + ",\n" +
            "address:'" + address + "\n" +
            "}";
    }
}
