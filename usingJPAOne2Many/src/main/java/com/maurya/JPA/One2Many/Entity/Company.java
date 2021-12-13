package com.maurya.JPA.One2Many.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String work;
	private long revenue;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(Integer id, String work, long revenue) {
		//super();
		this.id = id;
		this.work = work;
		this.revenue = revenue;
	}
	public Company(Integer companyId) {
		// TODO Auto-generated constructor stub
		this.id = companyId;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	
	
}
