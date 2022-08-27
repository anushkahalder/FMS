package com.example.finance.controller;

import com.example.finance.entity.User;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserContoller {

    @Autowired
    private UserService userService;

    @GetMapping("/users/getUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
