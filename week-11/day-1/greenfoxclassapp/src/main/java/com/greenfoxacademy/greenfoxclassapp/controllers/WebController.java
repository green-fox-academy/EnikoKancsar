package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    StudentService studentService;

    @Autowired
    public WebController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String loadMainPage(Model model) {
        model.addAttribute("studentCount", studentService.count());
        return "mainpage";
    }

    @GetMapping("gfa/list")
    public String studentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentlist";
    }

    @GetMapping("/gfa/add")
    public String addNewStudent(@ModelAttribute String studentName) {
        return "addstudent";
    }

    @GetMapping("/gfa/save")
    public String saveStudentName(@RequestParam String studentName) {
        studentService.save(studentName);
        return "redirect:list";
    }

}
