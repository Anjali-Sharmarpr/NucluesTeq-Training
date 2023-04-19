package com.springboot.api;

import jakarta.persistence.*;

@Entity
@Table(name = "New_Employees")
public class Employee {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String Name;

	@Column(name = "address")
	private String Address;
	
	@Column(name = "email_address")
	private String emailId;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String address, String emailId) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}