package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cat extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    // toString Method
    @Override
    public String toString() {
        return String.format("Cat: \n %s",super.toString()) ;
    }
}

// private Long id;
// private String name;
// private String breed;
// private int age;

// public Long getId() {
//     return id;
// }

// public void setId(Long id) {
//     this.id = id;
// }

// public String getName() {
//     return name;
// }

// public void setName(String name) {
//     this.name = name;
// }

// public String getBreed() {
//     return breed;
// }

// public void setBreed(String breed) {
//     this.breed = breed;
// }

// public int getAge() {
//     return age;
// }

// public void setAge(int age) {
//     this.age = age;
// }