package com.oauth.oauthpractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurtiyConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        httpSecurity.authorizeHttpRequests(auth->auth.requestMatchers("/").permitAll().anyRequest().authenticated())
                .oauth2Login(oauth-> oauth.defaultSuccessUrl("/home",true));
        return httpSecurity.build();
    }
}
