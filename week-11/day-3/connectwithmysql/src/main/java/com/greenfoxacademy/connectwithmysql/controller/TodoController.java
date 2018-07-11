package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping({"", "/list"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("isActive", isActive);
        return "todolist";
    }

    @GetMapping("list/add")
    public String addTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "addtodo";
    }

    @PostMapping("list/add")
    public String saveTodo(@ModelAttribute Todo newTodo) {
        todoRepository.save(newTodo);
        return "redirect:";
    }
}