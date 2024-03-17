package com.ale.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ale.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
