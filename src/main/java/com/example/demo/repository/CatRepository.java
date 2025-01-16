package com.example.demo.repository;

import com.example.demo.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    public Optional<Cat> findCatByNameAndAge(String name, int age);
    public Optional<Cat> findCatsByAgeBetween(int min, int max);
    public Optional<Cat> getCatById(long id);


}
