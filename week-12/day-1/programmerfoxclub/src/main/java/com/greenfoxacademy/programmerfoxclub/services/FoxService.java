package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.HashMap;

public interface FoxService {
    public HashMap<String, Fox> getAllFoxes();

    public void addNewFox(String name);

    public Fox findFoxByName(String name);
}
