package com.example.finance.controller;

import com.example.finance.entity.Admin;
import com.example.finance.entity.Product;
import com.example.finance.entity.User;
import com.example.finance.service.AdminService;
import com.example.finance.service.ProductService;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService prodService;

    //Create product
    @PostMapping("/create")
    public Product addProducts(@RequestBody Product product) {
        return prodService.addProducts(product);
    }

    //Get all products
    @GetMapping("/getall")
    public List<Product> getAllProducts(){
        return prodService.getAllProducts();
    }

//    Get particular product by id
    @GetMapping("/{product_id}")
    public Product getProd(@PathVariable("product_id") int prodId){
        return prodService.getProduct(prodId);
    }

    //Get product by name
    @GetMapping("/getbyname/{prodname}")
    public List<Product> getProductsByName(@PathVariable("prodname") String prodname) {
        return prodService.viewProductByName(prodname);
    }

//    //Edit product
    @PutMapping("/edit/{prod_id}")
    public Product updateProduct(@PathVariable("prod_id")  Product product, @RequestBody Product newproduct ){
        return prodService.updateProduct(product,newproduct);
    }

    //Delete Product
//    Get particular product by id
    @DeleteMapping("/delete/{product_id}")
    public String deleteProduct(@PathVariable("product_id") int pId){
        return prodService.deleteProduct(pId);

    }





}
