package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController() {
        foxService = new FoxService();
    }

    @RequestMapping("")
    public String mainPage(@RequestParam String name, Model model) {
        model.addAttribute("fox", foxService.findFoxByName(name));
        return "index";
    }

    @GetMapping("login")
    public String getLogin(Model model) {
        model.addAttribute("fox", new Fox());
        return "login";
    }

    @PostMapping("login")
    public String postLogin(@RequestParam String name) {
        if(!foxService.getAllFoxes().containsKey(name)) {
            foxService.addNewFox(name);
        }
        return "redirect:http://localhost:8080/?name=" + name;
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
}
