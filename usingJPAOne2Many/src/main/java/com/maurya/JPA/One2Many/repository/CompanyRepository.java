package com.maurya.JPA.One2Many.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maurya.JPA.One2Many.Entity.Company;

@Repository
public interface CompanyRepository  extends CrudRepository<Company, Integer>{

}
