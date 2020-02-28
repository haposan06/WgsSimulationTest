package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User register(User user);
    public User login(String email, String password);
    public User updateLike(List<User> user);
}
