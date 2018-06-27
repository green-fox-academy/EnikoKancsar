package com.greenfoxacademy.hellobeanworldapplication;

import com.greenfoxacademy.hellobeanworldapplication.services.Printer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class HellobeanworldapplicationApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(HellobeanworldapplicationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldapplicationApplication.class, args)
                .getBean(Printer.class)
                .log("hello");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application started");
    }
}
