package com.example.finance.service;

import com.example.finance.entity.Admin;
import com.example.finance.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService{
    Admin saveAdmin(Admin admin);

    List<Admin> getAllAdmins();

    List<User> getAllUsers();
}
