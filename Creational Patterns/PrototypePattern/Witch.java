package PrototypePattern;

public class Witch extends Character {

    public Witch(int heath, int mana, int strength, String name) {
        super(heath, mana, strength, name);
    }

    public Witch clone() {
        return new Witch(this.getHeath(), this.getMana(), this.getStrength(), this.getName());
    }
}