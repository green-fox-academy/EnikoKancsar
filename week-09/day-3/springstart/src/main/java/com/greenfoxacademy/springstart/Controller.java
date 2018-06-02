package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {

    @RequestMapping("/cicak")
    public ArrayList<String> getCicaNames() {
        return new ArrayList<String>(
                Arrays.asList(
                        "Fluffy",
                        "Mirci",
                        "Naomi",
                        "Momo"
                )
        );
    }
}
