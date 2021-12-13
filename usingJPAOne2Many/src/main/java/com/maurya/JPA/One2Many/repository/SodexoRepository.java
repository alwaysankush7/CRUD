package com.maurya.JPA.One2Many.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maurya.JPA.One2Many.Entity.Sodexo;

@Repository
public interface SodexoRepository extends CrudRepository<Sodexo, Integer> {

		
}
