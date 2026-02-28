package BridgePattern;

public class AmericanRestaurant extends AbstractRestaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void orderPizza() {
        System.out.println("Ordering pizza from American Restaurant");
        pizza.bake();
    }

    public void orderSpecialPizza() {
        System.out.println("Ordering special pizza from American Restaurant");
        pizza.bake();
    }
    
}