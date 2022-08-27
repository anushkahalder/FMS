package com.example.finance.service;

import com.example.finance.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    public User verifyUser(Long id);
}
