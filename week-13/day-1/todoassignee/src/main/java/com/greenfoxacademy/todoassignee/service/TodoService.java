package com.greenfoxacademy.todoassignee.service;

import com.greenfoxacademy.todoassignee.model.Todo;

import java.util.List;

public interface TodoService {
    void add(Todo todo);

    void deleteById(Long id);

    void update(Todo selectedTodo);

    List<Todo> findAll();

    List<Todo> findAllById(Long id);

    List<Todo> findAllByTitle(String title);
}
