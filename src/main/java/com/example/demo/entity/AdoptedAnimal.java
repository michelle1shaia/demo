package com.example.demo.entity;

import java.sql.Time;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class AdoptedAnimal {

    
    private long animalId;
    private long adopterId;
    private int price;
    private Time timeStamp;

    public AdoptedAnimal(Animal animal, Person person) {
        this.animalId = animal.getId();
        this.adopterId = person.getId();
        this.timeStamp = new Time(System.currentTimeMillis()); 
    }
    
    public long getAnimalId() {
        return this.animalId;
    }
    
    public void setAnimalId(long animalId) {
        this.animalId = animalId;
    }
    
    public long getAdopterId() {
        return this.adopterId;
    }
    
    public void setAdopterId(long adopterId) {
        this.adopterId = adopterId;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public Time getTimeStamp() {
        return this.timeStamp;
    }
    
    public void setTimeStamp(Time timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    @Override
    public String toString() {
        return "{" +
            " animalId:'" + animalId + ",\n" +
            "adopterId:'" + adopterId + ",\n" +
            "price:'" + price + ",\n" +
            "timeStamp:'" + timeStamp + "\n" +
            "}";
    }
    
}
