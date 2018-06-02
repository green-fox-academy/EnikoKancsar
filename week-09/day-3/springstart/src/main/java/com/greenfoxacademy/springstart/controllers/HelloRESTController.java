package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    private final AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String name) {
        return new Greeting(id.incrementAndGet(), "Hello " + name);
    }
}
