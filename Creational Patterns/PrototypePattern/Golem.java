package PrototypePattern;

public class Golem extends Character {

    public Golem(int heath, int mana, int strength, String name) {
        super(heath, mana, strength, name);
    }

    public Golem clone() {
        return new Golem(this.getHeath(), this.getMana(), this.getStrength(), this.getName());
    }  

    public String toString() {
        return "Golem [heath=" + getHeath() + ", mana=" + getMana() + ", strength=" + getStrength() + ", name=" + getName() + "]";
    };
}