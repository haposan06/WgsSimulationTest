package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User saveOrUpdate(User user);

    public User login(String email, String password);
}
