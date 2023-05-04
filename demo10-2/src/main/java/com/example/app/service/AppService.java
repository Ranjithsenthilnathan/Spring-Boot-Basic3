package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.PersonModel;
import com.example.app.repository.PersonRepository;

@Service
public class AppService
{
	@Autowired
	PersonRepository personRepo;
	
	public List<PersonModel> fetchAllPersons(){
		return personRepo.findAll();
	}
	
	public PersonModel savePersons(PersonModel p) {
		return personRepo.save(p);
	}
}
