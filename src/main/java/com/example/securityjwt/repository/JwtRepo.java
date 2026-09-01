package com.example.securityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securityjwt.entity.JwtEntity;

@Repository
public interface JwtRepo extends JpaRepository<JwtEntity, Long> {


    
}
