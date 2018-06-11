package com.greenfoxacademy.coloring;

import org.springframework.stereotype.Service;

@Service
public class RedImpl implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
