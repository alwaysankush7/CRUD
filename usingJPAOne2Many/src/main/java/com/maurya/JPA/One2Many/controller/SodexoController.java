package com.maurya.JPA.One2Many.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurya.JPA.One2Many.Entity.Employee;
import com.maurya.JPA.One2Many.Entity.Sodexo;
import com.maurya.JPA.One2Many.service.SodexoSevice;

@RestController
public class SodexoController {

	@Autowired
	SodexoSevice service;
	
	@PostMapping("sodexo/{employeeId}")
	void addNewCard(@RequestBody Sodexo theSodexo ,@PathVariable Integer employeeId) {
		theSodexo.setTheEmployee(new Employee(employeeId));
		service.addCard(theSodexo);
	}
	
	@RequestMapping("sodexo")
	Iterable<Sodexo> getAllCardDetails(){
	return	service.getSodexo();
	}
	
}
