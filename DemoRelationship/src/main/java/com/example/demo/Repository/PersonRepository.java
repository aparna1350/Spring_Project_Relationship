package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
