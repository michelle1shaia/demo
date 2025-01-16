package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dog extends Animal{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;
    // private String name;
    // private String breed;
    // private int age;
    private boolean isTamed;

    
    public boolean isTamed() {
        return isTamed;
    }
    
    // toString Method
    @Override
    public String toString() {
        String tamed = isTamed? "is" : "is not";
        return String.format("Dog: \n %s \n%s tamed!",super.toString(), tamed) ;
    }
}

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