package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Person;
import com.example.demo.Repository.PersonRepository;

@Service
public class PersonService {
@Autowired
PersonRepository personRepo;
public List<Person> fetchAllPersons()
{
	return personRepo.findAll();
}
public Person savePersons(Person p)
{
	return personRepo.save(p);
}
}
