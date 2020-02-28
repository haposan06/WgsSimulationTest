package com.example.accessingdatamysql.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.accessingdatamysql.repository.UserRepository;
import com.example.accessingdatamysql.service.UserService;

public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;

}
