package com.greenfoxacademy.usefulutilities.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UtilityService {

    public String getRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return "rgb(" + r + ", " + g + ", " + b + ")";
    }

    public boolean validateEmail(String email) {
        return (email.contains("@") && email.contains("."));
    }

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }
}