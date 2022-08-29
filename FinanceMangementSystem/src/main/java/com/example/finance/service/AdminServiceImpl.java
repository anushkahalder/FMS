package com.example.finance.service;

import com.example.finance.entity.Admin;
import com.example.finance.entity.User;
import com.example.finance.repository.AdminRepository;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    //To create custom query to get admin details already in db without providing admin id
    @PersistenceContext
    EntityManager em;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    //To Save a admin in Database
    @Override
    public Admin addAdmin(Admin admin) {
       return adminRepository.save(admin);
    }



    //To check the admin username and password
    @Override
    public String adminLogin(Admin admin) {

        //Check if a admin is present with the provided username and password by building jpql query
        String jpql = "select a from Admin a where a.aname=:aname and a.apassword=:pwd";

        TypedQuery<Admin> query = em.createQuery(jpql, Admin.class);
        query.setParameter("aname", admin.getAname());
        query.setParameter("pwd", admin.getApassword());

        //Storing the result of query in Admin object if we find one or returing false if we find null
        Admin foundAdmin = query.getResultList().stream().findFirst().orElse(null);

        //Now we check if the returned object by the query is admin or not
        if(foundAdmin == null){
            return "Admin not Found";
        }else{
            return "Admin Found\n"+foundAdmin.getAdmin_id()+"\n"+foundAdmin.getAname()+"\n"+foundAdmin.getApassword()+"\nLogged in Successfully";
        }

    }



    @Override
    public Integer activateUser(long userId, String status) {
        return adminRepository.activateUser(userId,status);
    }

}
