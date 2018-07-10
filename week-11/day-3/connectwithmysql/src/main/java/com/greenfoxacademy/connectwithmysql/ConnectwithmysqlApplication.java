package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication implements CommandLineRunner {

    private final TodoRepository todoRepository;

    @Autowired
    public ConnectwithmysqlApplication(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Start the day", true, true));
        todoRepository.save(new Todo("Finish H2 Workshop1", true, true));
        todoRepository.save(new Todo("Finish JPA Workshop2", true, true));
        todoRepository.save(new Todo("Be happy", false, true));
        todoRepository.save(new Todo("Create a CRUD Project", true, false));
    }
}
