package StrategyPattern;

import StrategyPattern.Card;

public class CreditCardPayment extends Card  implements PaymentStrategy {

    CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(cardNumber, cardHolderName, expiryDate, cvv);
    }

    @Override
    public void collectPaymentDetails() {
        // Simulate collecting credit card details
        System.out.println("Collecting credit card details...");
        // In a real application, you would collect these details from user input
        // this.cardNumber = "1234 5678 9012 3456";
        // this.cardHolderName = "John Doe";
        // this.expiryDate = "12/25";
        // this.cvv = "123";
    }

    @Override
    public void pay(double amount) {
        // Simulate processing the payment
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card Number: " + getMaskedCardNumber());
        System.out.println("Card Holder: " + getCardHolderName());
        System.out.println("Expiry Date: " + getExpiryDate());
        System.out.println("CVV: " + getCvv());
        // In a real application, you would integrate with a payment gateway here
        System.out.println("Payment successful!");
    }
    
}