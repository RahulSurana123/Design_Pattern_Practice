package StrategyPattern;

public class DebitCardPayment extends Card implements PaymentStrategy {

     DebitCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(cardNumber, cardHolderName, expiryDate, cvv);
    }

    @Override
    public void collectPaymentDetails() {
        // Simulate collecting debit card details
        System.out.println("Collecting debit card details...");
        // In a real application, you would collect these details from user input
        // this.cardNumber = "9876 5432 1098 7654";
        // this.cardHolderName = "Jane Smith";
        // this.expiryDate = "11/24";
        // this.cvv = "456";
    }

    @Override
    public void pay(double amount) {
        // Simulate processing the payment
        System.out.println("Processing debit card payment of $" + amount);
        System.out.println("Card Number: " + getMaskedCardNumber());
        System.out.println("Card Holder: " + getCardHolderName());
        System.out.println("Expiry Date: " + getExpiryDate());
        System.out.println("CVV: " + getCvv());
        // In a real application, you would integrate with a payment gateway here
        System.out.println("Payment successful!");
    }
}