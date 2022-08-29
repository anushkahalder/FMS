package com.example.finance.repository;

import com.example.finance.entity.Product;
import com.example.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


    //FindByName


//    public Product findByp_name(String prodname);
    @Transactional
    @Query("SELECT p FROM Product p WHERE p.p_name = ?1")
    public List<Product> findByName(String prodname);



}
