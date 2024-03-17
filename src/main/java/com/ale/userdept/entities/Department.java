package com.ale.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {

	// Attributes Declaration
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	// Constructor
	public Department() {

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

}
