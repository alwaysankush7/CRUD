package com.maurya.JPA.One2Many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurya.JPA.One2Many.Entity.Company;
import com.maurya.JPA.One2Many.Entity.Employee;
import com.maurya.JPA.One2Many.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("employee/{companyId}")
	void addNewEmployee(@RequestBody  Employee theEmployee , @PathVariable Integer companyId) {
		theEmployee.setTheCompany(new Company(companyId));
		service.addNewEmp(theEmployee);
	}
	
	@RequestMapping("employee")
	Iterable<Employee> getAllEmployeeDetails(){
	return	service.getAll();
	}
	
	
	@GetMapping("employee/{name}")
	List<Employee> getByDetailByName(String name){
		return service.getByName(name);
	}
}
