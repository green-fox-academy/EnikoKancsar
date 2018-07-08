package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    StudentService studentService;

    @Autowired
    public WebController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String loadMainPage() {
        return "mainpage";
    }

    @GetMapping("gfa/list")
    public String studentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentlist";
    }
}
