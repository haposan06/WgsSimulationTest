package com.example.accessingdatamysql.service.implementation;

import com.example.accessingdatamysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.accessingdatamysql.repository.UserRepository;
import com.example.accessingdatamysql.service.UserService;

import java.util.List;

public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User register(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User login(String email, String password) {
		return userRepository.findByEmailOrUsernameAndPassword(email, password);
	}

	@Override
	public User updateLike(List<User> user) {
		return null;
	}
}
