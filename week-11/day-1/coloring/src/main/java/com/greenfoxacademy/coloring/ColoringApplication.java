package com.greenfoxacademy.coloring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ColoringApplication.class);

    @Autowired
    Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(ColoringApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application started");
    }
}
