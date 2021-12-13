package com.maurya.JPA.One2Many.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maurya.JPA.One2Many.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	List<Employee> getEmployeeByName(String name);

}
