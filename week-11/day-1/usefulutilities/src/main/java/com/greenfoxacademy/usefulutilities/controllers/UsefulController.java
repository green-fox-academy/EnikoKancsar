package com.greenfoxacademy.usefulutilities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.Random;

@Controller
public class UsefulController {
    @GetMapping("useful")
    public String loadMainPage() {
        return "mainpage";
    }

    @GetMapping("useful/colored")
    public String randomColoredPage(Model model) {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        model.addAttribute("randomColor", "rgb(" + r + ", " + g + ", " + b + ")");
        return "randomColorPage";
    }
}
