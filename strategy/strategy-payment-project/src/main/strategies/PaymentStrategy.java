package main.strategies;

public interface PaymentStrategy {
    void collectPaymentDetails();
    void pay(int amount);
}
