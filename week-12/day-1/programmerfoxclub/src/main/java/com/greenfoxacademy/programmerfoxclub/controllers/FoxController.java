package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxServiceImpl foxService;

    @Autowired
    public FoxController(FoxServiceImpl foxService) {
        this.foxService = foxService;
    }

    @GetMapping("nutritionStore")
    public String getNutritionStore(@RequestParam String name, Model model) {
        model.addAttribute("fox", foxService.findFoxByName(name));
        return "nutritionstore";
    }

    @PostMapping("nutritionStore")
    public String postNutritionStore(@RequestParam String name, @RequestParam String newFood, @RequestParam String newDrink) {
        foxService.findFoxByName(name).setFood(newFood);
        foxService.findFoxByName(name).setDrink(newDrink);
        return "redirect:http://localhost:8080/?name=" + name;
    }

    @GetMapping("trickCenter")
    public String getTrickCenter(@RequestParam String name, Model model) {
        model.addAttribute("fox", foxService.findFoxByName(name));
        return "trickcenter";
    }

    @PostMapping("trickCenter")
    public String postTrickCenter(@RequestParam String name, @RequestParam String newTrick) {
        foxService.findFoxByName(name).addTrick(newTrick);
        return "redirect:http://localhost:8080/?name=" + name;
    }
}
