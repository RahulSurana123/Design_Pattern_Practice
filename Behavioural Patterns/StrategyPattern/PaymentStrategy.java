package StrategyPattern;

public interface PaymentStrategy {
    void collectPaymentDetails();
    void pay(double amount);
}