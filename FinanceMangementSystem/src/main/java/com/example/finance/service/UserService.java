package com.example.finance.service;

import com.example.finance.entity.User;
import com.example.finance.error.PasswordMismatchException;

import java.util.List;

public interface UserService {

    User createUser(User user) throws PasswordMismatchException;

    List<User> getAllUsers();

    User getUser(Long userId);
}
