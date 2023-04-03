package main;

// CONTEXT

import main.strategies.PaymentStrategy;

public class Order {

    private int totalCost = 0;

    public void processOrder(PaymentStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
