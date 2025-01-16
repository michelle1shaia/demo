package com.example.demo.repository;

import com.example.demo.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

    public Optional<Dog> findDogByNameAndAge(String name, int age);
    public Optional<Dog> findDogsByAgeBetween(int min, int max);
    public Optional<Dog> getDogById(long id);


}
