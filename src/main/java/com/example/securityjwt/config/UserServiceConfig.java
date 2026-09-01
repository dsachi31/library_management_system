package com.example.securityjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserServiceConfig {
    
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) throws Exception{

        return new InMemoryUserDetailsManager(
            User.withUsername("divya")
                .password(encoder.encode("password"))
                .roles("USER")
                .build(),
            User.withUsername("admin")
                .password(encoder.encode("admin@123"))
                .roles("ADMIN")
                .build());


    }
}
