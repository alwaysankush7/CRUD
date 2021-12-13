package com.maurya.JPA.One2Many.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sodexo")
public class Sodexo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer amount;
	
	@OneToOne
	private Employee theEmployee;
	
	public Employee getTheEmployee() {
		return theEmployee;
	}

	public void setTheEmployee(Employee theEmployee) {
		this.theEmployee = theEmployee;
	}

	public Sodexo(Integer id , Integer amount , Integer EmployeeId) {
		this.id=id;
		this.amount=amount;
		this.theEmployee=new Employee(EmployeeId);
	}
	
	public Sodexo() {
		// TODO Auto-generated constructor stub
	}
	
	public Sodexo(Integer id, Integer amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
