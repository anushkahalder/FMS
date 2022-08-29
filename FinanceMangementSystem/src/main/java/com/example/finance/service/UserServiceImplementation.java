package com.example.finance.service;

import com.example.finance.entity.User;
import com.example.finance.error.PasswordMismatchException;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;



    @Override
    public User createUser(User user) throws PasswordMismatchException {
        if(!user.getUser_password().equals(user.getUser_confirm_password())){
            throw new PasswordMismatchException("Entered Password and Confirm Password must be same !!");
        }
       return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

	@Override
	public User getCardDetails() {
		// TODO Auto-generated method stub
		return userRepository.getCardDetails();
	}

//	@Override
//	public User getCardDetails(long uid) {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
