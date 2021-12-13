package com.maurya.JPA.One2Many.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String role;
	
	@ManyToOne
	private Company theCompany;
	
	public Employee(Integer id , String name , String role , Integer companyId) {
		this.id = id;
		this.name = name;
		this.role=role;
		this.theCompany= new Company(companyId);
	}
	
	
	public Company getTheCompany() {
		return theCompany;
	}
	public void setTheCompany(Company theCompany) {
		this.theCompany = theCompany;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(Integer id, String name, String role) {
		super();
		
		this.id = id;
		this.name = name;
		this.role = role;
	}


	public Employee(Integer employeeId) {
		// TODO Auto-generated constructor stub
		this.id=employeeId;
	}
	
	
}
