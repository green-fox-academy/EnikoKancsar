package com.greenfoxacademy.todoassignee.controller;

import com.greenfoxacademy.todoassignee.model.Todo;
import com.greenfoxacademy.todoassignee.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    TodoServiceImpl todoService;

    @Autowired
    public TodoController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"", "/list"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        model.addAttribute("todos", todoService.findAll());
        model.addAttribute("isActive", isActive);
        model.addAttribute("searchedTodo", new Todo());
        return "todolist";
    }

    @PostMapping("list")
    public String list(@RequestParam String title, Model model) {
        model.addAttribute("searchedTodo", todoService.findAllByTitle(title));
        return "search";
    }

    @GetMapping("list/add")
    public String addTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "addtodo";
    }

    @PostMapping("list/add")
    public String saveTodo(@ModelAttribute Todo newTodo) {
        todoService.add(newTodo);
        return "redirect:";
    }

    @GetMapping("list/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoService.deleteById(id);
        return "redirect:http://localhost:8080/list";
    }

    @GetMapping("list/{id}/edit")
    public String getEditTodo(@PathVariable @ModelAttribute Long id, Model model) {
        model.addAttribute("selectedTodo", todoService.findAllById(id));
        return "edittodo";
    }

    @PostMapping("list/{id}/edit")
    public String postEditTodo(@PathVariable Long id, @ModelAttribute Todo selectedTodo) {
        selectedTodo.setId(id);
        todoService.update(selectedTodo);
        return "redirect:http://localhost:8080/list";
    }
}
