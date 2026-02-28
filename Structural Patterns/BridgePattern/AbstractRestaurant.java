package BridgePattern;

// Implementor This can be an interface or abstract class that defines the operations that can be performed on the pizza.
abstract class AbstractRestaurant {
    protected Pizza pizza;

    public AbstractRestaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void orderPizza();
}