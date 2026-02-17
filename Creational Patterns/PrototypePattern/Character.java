package PrototypePattern;

public abstract class Character {

    private int heath=0;
    private int mana=0;
    private int strength=0;
    private String name="";

    public Character(int heath, int mana, int strength, String name){
        this.heath = heath;
        this.mana = mana;
        this.strength = strength;
        this.name = name;
    }

    public int getHeath() {
        return heath;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public abstract Character clone();
}