package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    public final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody UserRegisterRequest request) {
        return service.creatUser(request.getFullname(), request.getUsername(), request.getPassword());
    }
}

@NoArgsConstructor
@Data
@AllArgsConstructor
class UserRegisterRequest {
    private String fullname;
    private String username;
    private String password;

}
