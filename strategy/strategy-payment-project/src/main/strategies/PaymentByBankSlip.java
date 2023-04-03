package main.strategies;

public class PaymentByBankSlip implements PaymentStrategy {
    private String paymentMethod;

    @Override
    public void collectPaymentDetails() {
        paymentMethod = "Boleto Bancário";
        System.out.println("Método de pagamento: " + paymentMethod);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de " + amount + " reais efetuado por " + paymentMethod);
    }
    
}
