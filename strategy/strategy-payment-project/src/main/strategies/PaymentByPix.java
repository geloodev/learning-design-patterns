package main.strategies;

public class PaymentByPix implements PaymentStrategy {
    private String paymentMethod;

    @Override
    public void collectPaymentDetails() {
        paymentMethod = "PIX";
        System.out.println("Método de pagamento: " + paymentMethod);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de " + amount + " reais efetuado por PIX");
    }
    
}
