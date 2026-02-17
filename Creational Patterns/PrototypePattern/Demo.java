package PrototypePattern;

public class Demo {

    public static void main(String[] args) {
        
        ProtoTypeRegistery registery = new ProtoTypeRegistery();

        registery.addCharacter("golem", new Golem(100, 50, 20, "Golem"));
        registery.addCharacter("witch", new Witch(50, 100, 10, "Witch"));

        Character golem1 = registery.getCharacter("golem");
        Character golem2 = registery.getCharacter("golem");

        System.out.println(golem1 == golem2); // false
        System.out.println(golem1.getName()); // Golem
        System.out.println(golem2.getName()); // Golem
    }
    
}
