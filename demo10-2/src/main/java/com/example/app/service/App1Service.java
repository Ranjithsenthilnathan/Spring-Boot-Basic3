package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.App1Model;
import com.example.app.repository.App1Repository;

import jakarta.transaction.Transactional;

@Service
public class App1Service
{
	@Autowired
	App1Repository ar;
	public List<App1Model> fetchStudentsByNamePrefix(String prefix)
	{
		return ar.findByNameStartingWith(prefix);
	}
	public List<App1Model> fetchStudentsByNameSufix(String sufix)
	{
		return ar.findByNameEndingWith(sufix);
	}
	public List<App1Model> fetchStudentsByDepartment(String product)
	{
		return ar.findByDepartment(product);
	}
	public List<App1Model> getStudentsByDepartment(String product,String salesman)
	{
		return ar.getStudentsByDepartment(product, salesman);
	}
	@Transactional
	public int deleteStudentByName(String salesman)
	{
		return ar.deleteStudentByName(salesman);
	}
	public List<App1Model> findAll()
	{
		return ar.findAll();
	}
	@Transactional
	public int updateStudentByName(String product,String salesman)
	{
		return ar.updateStudentByName(product,salesman);
	}
}
