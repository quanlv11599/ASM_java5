package com.example.asm_java5.controller;

import com.example.asm_java5.entity.Products;
import com.example.asm_java5.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/products")
@Controller
public class ProductController {
    @Autowired
    ProductsRepository productsRepository;
//    Products products;

//    @ResponseBody
    @GetMapping("/add")
    public String add(){
        Products products = new Products();
        System.out.println("111111111111");
        products.setId(2);
        products.setName("Le");
        products.setImage("lll");
        productsRepository.save(products);
        System.out.println(products);
        return "admin/addProducts";
    }
}
