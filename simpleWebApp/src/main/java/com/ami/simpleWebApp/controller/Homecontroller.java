package com.ami.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Amisha's world";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't lie";
    }
}
