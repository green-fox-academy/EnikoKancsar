package com.greenfoxacademy.programmerfoxclub.models;

import java.util.LinkedHashSet;

public class Fox {
    private String name;
    private LinkedHashSet<String> tricks;
    private String food;
    private String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        tricks = new LinkedHashSet<>();
        food = "pizza";
        drink = "lemonade";
    }

    public Fox(String name, LinkedHashSet<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedHashSet<String> getTricks() {
        return tricks;
    }

    public void setTricks(LinkedHashSet<String> tricks) {
        this.tricks = tricks;
    }

    public void addTrick(String newTrick) {
        tricks.add(newTrick);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
