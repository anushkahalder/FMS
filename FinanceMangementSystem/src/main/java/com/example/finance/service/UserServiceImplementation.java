package com.example.finance.service;

import com.example.finance.entity.User;
import com.example.finance.error.PasswordMismatchException;
import com.example.finance.error.UserDontExistException;
import com.example.finance.error.UserNamePasswordIncorrectException;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService{

    //To create custom query to get user details already in db without providing user id
    @PersistenceContext
    EntityManager em;

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
       List<User> userlist = userRepository.findAll();
        List<User> users = userlist
                .stream()
                .map(user -> new User(
                        user.getReg_id(),
                        user.getUser_name(),
                        user.getPh_number(),
                        user.getEmail(),
                        user.getUser_password(),
                        user.getUser_confirm_password(),
                        user.getAddress(),
                        user.getCardType(),
                        user.getBankName(),
                        user.getAccNumber(),
                        user.getIfscCode(),
                        user.getIsVerified()))
                .collect(Collectors.toList());
        return users;

    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }



    @Override
    public boolean userLogin(User user) throws UserNamePasswordIncorrectException ,UserDontExistException {
        //Check if a admin is present with the provided username and password by building jpql query
        String jpql = "select u from User u where u.user_name=:uname";

        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("uname", user.getUser_name());

        //Storing the result of query in Admin object if we find one or returing false if we find null
        User foundUser = query.getResultList().stream().findFirst().orElse(null);

        //Now we check if the returned object by the query is admin or not
        if(foundUser == null){
            throw new UserDontExistException("User Not Found");
        }else if(!(user.getUser_password()).equals(foundUser.getUser_password())){
            throw new UserNamePasswordIncorrectException("Incorrect Username or Password");
        }
            return true;

    }



}
