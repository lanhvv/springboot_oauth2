package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2 {
    @GetMapping("/login/oauth2/code/oidc-client")
    public String login() {
        return "tao la bo chung may!";
    }
}
