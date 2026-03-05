package StrategyPattern;

public class PaymentService {

    public static void main(String[] args) {
        // Create a payment strategy (you can switch between CreditCardPayment and DebitCardPayment)
        PaymentStrategy paymentStrategy = new CreditCardPayment("1234 5678 9012 3456", "John Doe", "12/25", "123");
        // Collect payment details
        paymentStrategy.collectPaymentDetails();
        // Process the payment
        paymentStrategy.pay(100.00);

        // You can also use a different payment strategy
        PaymentStrategy debitPaymentStrategy = new DebitCardPayment("9876 5432 1098 7654", "Jane Smith", "11/24", "456");
        debitPaymentStrategy.collectPaymentDetails();
        debitPaymentStrategy.pay(50.00);
    }
    
}