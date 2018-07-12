package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("list/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:http://localhost:8080/list";
    }

    @GetMapping("list/{id}/edit")
    public String getEditTodo(@PathVariable @ModelAttribute Long id, Model model) {
        model.addAttribute("selectedTodo", todoRepository.findById(id));
        return "edittodo";
    }

    @PostMapping("list/{id}/edit")
    public String postEditTodo(@PathVariable Long id, @ModelAttribute Todo selectedTodo) {
        selectedTodo.setId(id);
        todoRepository.save(selectedTodo);
        return "redirect:http://localhost:8080/list";
    }
}