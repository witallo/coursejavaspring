package com.witallo.coursejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.witallo.coursejavaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
