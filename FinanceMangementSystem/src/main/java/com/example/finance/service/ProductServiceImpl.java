package com.example.finance.service;


import com.example.finance.entity.Product;
import com.example.finance.entity.User;
import com.example.finance.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository prodRepo;


    @Override
    public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }

    @Override
    public Product getProduct(int prodId) {
        return prodRepo.findById(prodId).get();
    }

    @Override
    public Product addProducts(Product product) {
        return  prodRepo.save(product);
    }
//
    @Override
    public List<Product> viewProductByName(String prodname) {
        return prodRepo.findByName(prodname);
    }

    @Override
    public Product updateProduct(Product product , Product newproduct) {

         Product p = prodRepo.findById(product.getProduct_id()).get();

         p.setP_name(newproduct.getP_name());
         p.setPrice(newproduct.getPrice());
         p.setP_description(newproduct.getP_description());
         p.setProdHistroy(newproduct.getProdHistroy());

        return prodRepo.save(p);
    }

//    @Override
    public String deleteProduct(int pId) {
        prodRepo.deleteById(pId);
        return "Sucessfully Deleted Product";
    }



}
