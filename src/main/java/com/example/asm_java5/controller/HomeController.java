package com.example.asm_java5.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String aâ(){
        return "*";
    }
}
