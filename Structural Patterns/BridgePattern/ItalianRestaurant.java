package BridgePattern;

public class ItalianRestaurant extends AbstractRestaurant {

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void orderPizza() {
        System.out.println("Ordering pizza from Italian Restaurant");
        pizza.bake();
    }
    
}