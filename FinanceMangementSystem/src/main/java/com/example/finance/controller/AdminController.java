package com.example.finance.controller;

import com.example.finance.entity.Admin;
import com.example.finance.entity.User;
import com.example.finance.service.AdminService;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    AdminController(){

    }

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }



    //Create Admin //->Restricted route use only once
    @PostMapping("/create")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    //Admin Login
    @PostMapping("/login")
    public String adminLogin(@RequestBody Admin admin){
         return adminService.adminLogin(admin);

    }

    //Get user list
    @GetMapping("/users")
    public List<User> getUserList(){
        return userService.getAllUsers();
    }

    //Activate user
    @PutMapping("users/activateuser/{id}")
    public Integer activateUser(@PathVariable("id") long userId){
        return adminService.activateUser(userId,"true");
    }


}
