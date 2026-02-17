package PrototypePattern;

import java.util.HashMap;

public class ProtoTypeRegistery {

    HashMap<String, Character> registery = new HashMap<>();

    public void addCharacter(String name, Character character) {
        registery.put(name, character);
    }

    public Character getCharacter(String name) {
        return registery.get(name).clone();
    }
}