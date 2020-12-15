
package com.witallo.coursejavaspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witallo.coursejavaspring.entities.User;
import com.witallo.coursejavaspring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long ID) {
		Optional<User> user =  userRepository.findById(ID);
		return user.get();
	}
}
