package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;

@RestController
public class PersonController {
@Autowired
PersonService pservice;
@GetMapping("/getAllPersons")
public List<Person> fetchAllPersons()
{
	return pservice.fetchAllPersons();
}
@PostMapping("/savePersons")
public Person savePersons(@RequestBody Person p)
{
	return pservice.savePersons(p);
}
}
