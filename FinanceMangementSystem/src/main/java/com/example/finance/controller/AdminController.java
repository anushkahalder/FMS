package com.example.finance.controller;

import com.example.finance.entity.Admin;
import com.example.finance.entity.User;
import com.example.finance.repository.AdminRepository;
import com.example.finance.service.AdminService;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getHome(){
      return "Welcome to Admin Section !";
    }

    @PostMapping("/admin")
    public Admin saveAdmin(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/admin/userslist")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("/admin/verifyuser/{id}")
    public User verifyUser(@PathVariable("id") Long id){
        return userService.verifyUser(id);
    }
}
