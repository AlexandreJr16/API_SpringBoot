package com.ale.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	// Attributes Declaration
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	// Department declaration
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	// Constructor
	public User() {
	}

	// Get id
	public Long getId() {
		return id;
	}

	// Set id
	public void setId(Long id) {
		this.id = id;
	}

	// Get name
	public String getName() {
		return name;
	}

	// Set name
	public void setName(String name) {
		this.name = name;
	}

	// Get email
	public String getEmail() {
		return email;
	}

	// Set email
	public void setEmail(String email) {
		this.email = email;
	}

	// Get department
	public Department getDepartment() {
		return department;
	}

	// Set department
	public void setDepartment(Department department) {
		this.department = department;
	}

}
