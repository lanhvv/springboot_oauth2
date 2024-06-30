package com.example.demo.controller;

import com.example.demo.service.SkillSetDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillSetDataController {
    private final SkillSetDataService skillSetDataService;

    public SkillSetDataController(SkillSetDataService skillSetDataService) {
        this.skillSetDataService = skillSetDataService;
    }

    @GetMapping("/skill_set_data/add")
    public String add() {
        this.skillSetDataService.add();
        return "add";
    }
}
