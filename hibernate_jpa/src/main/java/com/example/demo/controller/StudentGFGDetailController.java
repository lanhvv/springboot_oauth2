package com.example.demo.controller;

import com.example.demo.service.StudentGFGDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGFGDetailController {
    private final StudentGFGDetailService studentGFGDetailService;

    public StudentGFGDetailController(StudentGFGDetailService studentGFGDetailService) {
        this.studentGFGDetailService = studentGFGDetailService;
    }

    @GetMapping("/student-gfg-detail/add")
    public String add() {
        studentGFGDetailService.add();
        return "add";
    }
}
