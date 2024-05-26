package com.example.demo.controller;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(consumes = "*", produces = "application/json")
public class ApiController {
    @GetMapping(value = "/api/checkResponse")
    String checkResponse() {
        return "successful";
    }
}
