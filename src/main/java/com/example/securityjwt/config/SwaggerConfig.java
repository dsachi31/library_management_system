package com.example.securityjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi(){

       OpenAPI openapi  = new OpenAPI();
 openapi.info(new Info().title("Library Management System").contact(new Contact().name("Divya S").email("dsachi31@gmail.com").url("https://divya-s-pfi-2026.netlify.app/")).description("Get more info on library management system along with secured api implementation and documentation").version("1.0"));

    return openapi;
    }

    
    
}
