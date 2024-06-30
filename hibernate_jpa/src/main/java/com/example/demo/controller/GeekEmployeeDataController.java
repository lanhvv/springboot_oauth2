package com.example.demo.controller;

import com.example.demo.service.GeekEmployeeDataSerice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeekEmployeeDataController {
    private final GeekEmployeeDataSerice geekEmployeeDataSerice;

    public GeekEmployeeDataController(GeekEmployeeDataSerice geekEmployeeDataSerice) {
        this.geekEmployeeDataSerice = geekEmployeeDataSerice;
    }

    @GetMapping("/geek_employee_data/add")
    public String add() {
        this.geekEmployeeDataSerice.add();
        return "add";
    }
}
