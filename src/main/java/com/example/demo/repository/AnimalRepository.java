package com.example.demo.repository;

import com.example.demo.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    public Optional<Animal> findAnimalByNameAndAge(String name, int age);
    public Optional<Animal> findAnimalsByAgeBetween(int min, int max);
    public Optional<Animal> getAnimalById(long id);


}
