package com.example.finance.service;

import com.example.finance.entity.User;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User verifyUser(@PathVariable("id") Long id) {
        Optional<User> user = userRepository.findById(id);
        user.get().setIsVerified("True");
        return user.get();
    }
}
