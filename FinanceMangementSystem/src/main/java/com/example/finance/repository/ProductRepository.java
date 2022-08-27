
package com.example.finance.repository;

import com.example.finance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finance.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {


    


    @Autowired
    private ProductService pdtservide;


    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){


    }

}

