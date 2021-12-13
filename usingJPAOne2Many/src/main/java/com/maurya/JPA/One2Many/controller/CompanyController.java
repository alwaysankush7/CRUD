package com.maurya.JPA.One2Many.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurya.JPA.One2Many.Entity.Company;
import com.maurya.JPA.One2Many.Entity.Employee;
import com.maurya.JPA.One2Many.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	CompanyService service;
	
	@PostMapping("/company")
	void addNewCompany(@RequestBody Company cc) {
		service.addNewCmp(cc);
	}
	
	@GetMapping("company/{id}")
	Optional<Company> getCompanyById(@PathVariable Integer id){
		return service.getCompanyById(id);
	}
	
	
	
}
