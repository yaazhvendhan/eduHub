package com.oauth.oauthpractice.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String loginUser(){
        return "Welcome User";
    }

    @GetMapping( "/home")
    public String homePage( @AuthenticationPrincipal OAuth2User user){
        return "You have Logged In.....User Name :  "+user.getAttribute("name")+". "+"User Email:  "+user.getAttribute("email");
    }

}
