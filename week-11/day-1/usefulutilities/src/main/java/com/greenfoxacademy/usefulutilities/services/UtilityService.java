package com.greenfoxacademy.usefulutilities.services;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    public UtilityService() {
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