package com.example.spring_final.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.example.spring_final.model.Users;
import com.example.spring_final.repository.UserRepository;

@RestController

@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserRepository usersRepository;

    @PostMapping("/api/users")
    public Users saveUser(@RequestBody Users user) {
        System.out.println(user.getId());
        System.out.println(user.getDate());
        return usersRepository.save(user);
    }
    
}
