package com.witallo.coursejavaspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.witallo.coursejavaspring.entities.User;

@RestController
@RequestMapping(value="/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "119080936672", "1234567");
		return ResponseEntity.ok().body(u);
	}
}
