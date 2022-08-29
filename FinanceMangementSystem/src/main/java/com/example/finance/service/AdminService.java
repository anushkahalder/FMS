package com.example.finance.service;

import com.example.finance.entity.Admin;

public interface AdminService {
    String adminLogin(Admin admin);

    Admin addAdmin(Admin admin);

    Integer activateUser(long userId,String status);


}
