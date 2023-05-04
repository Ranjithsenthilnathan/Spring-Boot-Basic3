package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.App1Model;
import com.example.app.service.App1Service;
@RestController
public class App1Controller
{
	@Autowired
	App1Service as;
	@GetMapping("/get")
	public List<App1Model> getAllDetails()
	{
		return as.findAll();
	}
	//fetchStudentByNamePrefix?prefix=R
	@GetMapping("/Prefix")
	public List<App1Model> fetchStudentsByNamePrefix(@RequestParam String prefix)
	{
		return as.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/Sufix")
	public List<App1Model> fetchStudentsByNameSufix(@RequestParam String sufix)
	{
		return as.fetchStudentsByNameSufix(sufix);
	}
	@GetMapping("/Department")
	public List<App1Model> fetchStudentsByDepartment(@RequestParam String dept)
	{
		return as.fetchStudentsByDepartment(dept);
	}
	
	@GetMapping("/select/{dept}/{name}")
	public List<App1Model> fetchStudentsByDepartment(@PathVariable 
			String dept,@PathVariable String name)
	{
		return as.getStudentsByDepartment(dept, name);
	}
	@DeleteMapping("/delete/{name}")
	public String deleteStudentByName(@PathVariable String name)
	{
	int result=as.deleteStudentByName(name);
	if(result>0)
		return "record deleted";
	else
		return "Problem occured while deleting";
	}
	@PutMapping("/update/{department}/{name}")
	public String updateStudentByName(@PathVariable String department,@PathVariable String name)
	{
	int result=as.updateStudentByName(department,name);
	if(result>0)
		return "record updated";
	else
		return "Problem occured while updated";
	}
}
