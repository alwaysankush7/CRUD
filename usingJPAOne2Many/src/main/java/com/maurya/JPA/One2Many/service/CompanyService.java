package com.maurya.JPA.One2Many.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurya.JPA.One2Many.Entity.Company;
import com.maurya.JPA.One2Many.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository repo;
	
	public void addNewCmp(Company c) {
		repo.save(c);
	}
	
	public Optional<Company> getCompanyById(Integer id){
		return repo.findById(id);
	}

}
