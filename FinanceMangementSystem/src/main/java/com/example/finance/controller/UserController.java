package com.example.finance.controller;

import com.example.finance.entity.User;
import com.example.finance.error.PasswordMismatchException;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Get all user
    @GetMapping("/getallusers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //Get particular user by id
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.getUser(userId);
    }


    @PostMapping("/create")
    public User createUser(@RequestBody User user) throws PasswordMismatchException {
        return userService.createUser(user);
    }
}
