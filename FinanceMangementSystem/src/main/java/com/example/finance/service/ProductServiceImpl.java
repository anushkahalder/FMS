package com.example.finance.service;


import com.example.finance.entity.Product;
import com.example.finance.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository prodRepo;
    @Override
    public List<Product> viewProduct() {
        return prodRepo.findAll();
    }


}
