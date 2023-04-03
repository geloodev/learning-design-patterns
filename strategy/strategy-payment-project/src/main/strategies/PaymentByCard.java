package main.strategies;

public class PaymentByCard implements PaymentStrategy {
    private String paymentMethod;

    @Override
    public void collectPaymentDetails() {
        paymentMethod = "Cartão";
        System.out.println("Método de pagamento: " + paymentMethod);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de " + amount + " reais efetuado por " + paymentMethod);
    }
    
}
