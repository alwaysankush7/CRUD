package com.maurya.JPA.One2Many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurya.JPA.One2Many.Entity.Employee;
import com.maurya.JPA.One2Many.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public void addNewEmp(Employee ee) {
		repo.save(ee);
	}
	
public	Iterable<Employee> getAll(){
		return repo.findAll();
	}
public List<Employee> getByName(String name){
	return repo.getEmployeeByName(name);
}
	
}
