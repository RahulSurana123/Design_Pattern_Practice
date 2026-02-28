package BridgePattern;

public class Demo {

    public static void main(String[] args) {
        Pizza vegPizza = new VegPizza();
        AbstractRestaurant italianVegRestaurant = new ItalianRestaurant(vegPizza);
        italianVegRestaurant.orderPizza();

        Pizza nonVegPizza = new NonVegPizza();
        AbstractRestaurant nonVegRestaurant = new AmericanRestaurant(nonVegPizza);
        nonVegRestaurant.orderPizza();
    }
}