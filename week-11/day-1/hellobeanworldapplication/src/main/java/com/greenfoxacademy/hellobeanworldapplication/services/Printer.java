package com.greenfoxacademy.hellobeanworldapplication.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public Printer() {
        System.out.println(LocalDateTime.now() + "letrejottem");
    }
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}