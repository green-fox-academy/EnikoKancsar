package com.greenfoxacademy.coloring;

public class GreenImpl implements MyColor {
    @Override
    public void printColor() {
        printer.log("It is green in color...");
    }
}
