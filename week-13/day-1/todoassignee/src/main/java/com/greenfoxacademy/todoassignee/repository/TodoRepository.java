package com.greenfoxacademy.todoassignee.repository;

import com.greenfoxacademy.todoassignee.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAll();

    List<Todo> findAllById(Long id);

    List<Todo> findAllByTitle(String title);
}
