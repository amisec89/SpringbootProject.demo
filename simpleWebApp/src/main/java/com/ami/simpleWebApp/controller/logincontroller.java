package com.ami.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logincontroller {

    @RequestMapping("/login")
    public String login(){
        return "Login Page!!";
    }
}
