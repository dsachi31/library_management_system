package com.example.securityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestController;

import com.example.securityjwt.service.JwtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/jwt")
public class JwtController {

    @Autowired
    private JwtService service;
   
   
    
    @GetMapping("/greet")
    public String Greet(){
        return "Hello Divya..!";
    }

    @GetMapping("/me")
    public String getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Logged in as :"+authentication.getName()+"| Roles :"+authentication.getAuthorities();
        
    }
    


    
    
}
