package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/add")
    public String add() {
        studentService.add();
        return "add";
    }

    @GetMapping("/student/update")
    public String update() {
        studentService.update();
        return "add";
    }


    @GetMapping("/student/delete/{id}")
    public String delete(@PathVariable long id) {
        studentService.delete(id);
        return "delete";
    }
}
