package com.example.finance.repository;

import com.example.finance.entity.Admin;
import com.example.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    @Transactional
    @Modifying
    @Query("update User u set u.isVerified=:status where u.reg_id=:userId")
    Integer activateUser(long userId,String status);

}
