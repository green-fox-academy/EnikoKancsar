package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {
    private HashMap<String, Fox> foxes;

    public FoxService() {
        foxes = new HashMap<>();
    }

    public HashMap<String, Fox> getAllFoxes() {
        return foxes;
    }

    public void addNewFox(String name) {
        foxes.put(name, new Fox(name));
    }

    public Fox findFoxByName(String name) {
        return foxes.get(name);
    }
}
