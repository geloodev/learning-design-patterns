package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.strategies.PaymentByBankSlip;
import main.strategies.PaymentByCard;
import main.strategies.PaymentByPix;
import main.strategies.PaymentStrategy;

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
    private static Order order = new Order();
    private static PaymentStrategy strategy;

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("COMPRA EXEMPLO: CELULAR DE 2000 REAIS\n" + 
                           "Como você deseja efetuar a compra?\n" + 
                           "1 - PIX\n" + 
                           "2 - Cartão\n" + 
                           "3 - Boleto Bancário");

        int choice = 0;
        do {
            System.out.println("DIGITE SUA OPÇÃO: ");
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    strategy = new PaymentByPix();
                    break;
                
                case 2:
                    strategy = new PaymentByCard();
                    break;
                
                case 3:
                    strategy = new PaymentByBankSlip();
                    break;
                
                default:
                    System.out.println("ESCOLHA INVÁLIDA, TENTE NOVAMENTE");
            }
        } while (choice < 1 || choice > 3);

        order.setTotalCost(2000);
        order.processOrder(strategy);
        strategy.pay(order.getTotalCost());
        
    }
}