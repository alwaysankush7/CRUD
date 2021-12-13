package com.maurya.JPA.One2Many.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurya.JPA.One2Many.Entity.Sodexo;
import com.maurya.JPA.One2Many.repository.SodexoRepository;

@Service
public class SodexoSevice {

	@Autowired
	SodexoRepository repo;
	
public 	void addCard(Sodexo so) {
		repo.save(so);
	}
public Iterable<Sodexo> getSodexo() {
	return repo.findAll();
}

		getEmployeeBysodexoId(Integer id){
				re
		}
	
}
