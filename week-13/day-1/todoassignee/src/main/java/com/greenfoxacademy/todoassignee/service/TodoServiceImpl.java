package com.greenfoxacademy.todoassignee.service;

import com.greenfoxacademy.todoassignee.model.Todo;
import com.greenfoxacademy.todoassignee.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> findAllById(Long id) {
        return todoRepository.findAllById(id);
    }

    @Override
    public List<Todo> findAllByTitle(String title) {
        return todoRepository.findAllByTitle(title);
    }

    @Override
    public void update(Todo selectedTodo) {
        todoRepository.save(selectedTodo);
    }
}
