package com.vmware.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

 @EnableWebSecurity
 @Configuration
 public class CsrfSecurityConfig {

    @Bean
     protected void configure(HttpSecurity http) throws Exception {
         http
             .cors(cors -> cors.disable());
     }
 }