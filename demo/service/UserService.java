package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service

public class UserService {
    public final UserRepository repository;
    public UserService(UserRepository repository){
        this.repository=repository;
    }
    public User creatUser(String fullname, String username, String password)
    {
        User user=new User(fullname,username,password);
        return repository.save(user);
    }

    
}
