package com.example.finance.service;

import com.example.finance.entity.Product;
import com.example.finance.entity.User;

import java.util.List;

public interface ProductService {

    Product addProducts(Product product);
    List<Product> getAllProducts();
    Product getProduct(int prodId);
    List<Product>  viewProductByName(String prodname);

   Product updateProduct(Product product,Product newproduct);
//
//
    String deleteProduct(int pId);
}
