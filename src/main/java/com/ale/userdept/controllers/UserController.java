package com.ale.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale.userdept.entities.User;
import com.ale.userdept.repositories.UserRepository;

//User Controller
@RestController
@RequestMapping(value = "/users")
public class UserController {

	// Dependency Injection
	@Autowired
	private UserRepository repository;

	// Find all users
	@GetMapping
	public List<User> findAll() {
		List<User> response = repository.findAll();
		return response;
	}

	// Find user by id
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User response = repository.findById(id).get();
		return response;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User response = repository.save(user);
		return response;
	}

}
