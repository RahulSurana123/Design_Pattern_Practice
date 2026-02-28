package BridgePattern;

public class VegPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Veg Pizza");
    }
}