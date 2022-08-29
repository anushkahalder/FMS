package com.example.finance.service;

import com.example.finance.entity.User;
import com.example.finance.error.PasswordMismatchException;
import com.example.finance.error.UserDontExistException;
import com.example.finance.error.UserNamePasswordIncorrectException;

import java.util.List;

public interface UserService {

    User createUser(User user) throws PasswordMismatchException;

    List<User> getAllUsers();

    User getUser(Long userId);

	User getCardDetails(long uid);

    User getUserById(Long userId);

    boolean userLogin(User user) throws UserNamePasswordIncorrectException, UserDontExistException;

}
