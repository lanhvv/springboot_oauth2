package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;
import java.security.Principal;

//@RestController

@Controller
public class LoginController {
    @GetMapping("/")
    public String getPage(HttpServletRequest request, HttpServletResponse response, Principal principal)
            throws IOException {
        if (principal != null) { //depends on your security config, maybe you want to check the security context instead if you allow anonym access
            String redirect_uri = request.getParameter("redirect_uri");
            //here you must get all the other attributes thats needed for the authorize url
            if (redirect_uri == null) {
                redirect_uri = "https://your.default.app.url";
            }
            return "redirect:https://localhost:8443/oauth/authorize?response_type=token&state=6c2bb162-0f26-4caa-abbe-b65f7e5c6a2e&client_id=admin&redirect_uri=" + URLEncoder.encode(redirect_uri, "UTF-8");
        }
        return "login";
    }
//    @GetMapping("/logout")
//    public String logout() {
//        return "logout";
//    }
}
