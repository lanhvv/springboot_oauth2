package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class Oauth2 {
    @PreAuthorize("hasAnyAuthority(SCOPE_user.read)")
    @GetMapping("/login/oauth2/code/oidc-client")
    public Map<String, String> login() {
        Object jwt = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Map.of("message", "Hello");
    }
}

