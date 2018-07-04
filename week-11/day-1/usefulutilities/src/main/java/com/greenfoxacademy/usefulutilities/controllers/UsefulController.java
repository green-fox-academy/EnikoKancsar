package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class UsefulController {

    UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }
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

    @GetMapping("useful/emailValidator")
    public String emailCheck(@RequestParam String emailAddress, Model model) {
        model.addAttribute("isValid", utilityService.validateEmail(emailAddress));
        model.addAttribute("validEmail", emailAddress + " is a valid email address");
        model.addAttribute("invalidEmail", emailAddress + " is not a valid email address");
        return "emailValidator";
    }

    @GetMapping("useful/encoding")
    public String encode(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("encodedText", utilityService.caesar(text, number));
        return "encodedTextPage";
    }
}
