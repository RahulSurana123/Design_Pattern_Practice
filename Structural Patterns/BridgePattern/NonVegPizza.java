package BridgePattern;

public class NonVegPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Non-Veg Pizza");
    }
}