package com.example.securityjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.securityjwt.repository.JwtRepo;

@Service
public class JwtServiceImpl implements JwtService {

    @Autowired
    private JwtRepo repo;
    
}
