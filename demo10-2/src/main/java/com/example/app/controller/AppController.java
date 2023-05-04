package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.PersonModel;
import com.example.app.service.AppService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class AppController
{
	@Autowired
	AppService pService;
	@Tag(name="Get" ,description="get data")
	
	@GetMapping("/getAllPersons")
	public List<PersonModel> fetchAllPersons()
	{
		List<PersonModel> pList=pService.fetchAllPersons();
		return pList;
	}
	
	@PostMapping("/savePersons")
	public PersonModel savePersons(@RequestBody PersonModel p)
	{
		return pService.savePersons(p);
	}
}
