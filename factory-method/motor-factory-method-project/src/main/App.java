package main;

import main.factories.Factory;
import main.factories.FactoryAlemao;
import main.factories.FactoryBrasileiro;
import main.factories.FactoryJapones;

public class App {

    public static void main(String[] args) throws Exception {

        Factory alemao = new FactoryAlemao();
        alemao.createMotor().turnOn();

        Factory brasileiro = new FactoryBrasileiro();
        brasileiro.createMotor().turnOn();

        Factory japones = new FactoryJapones();
        japones.createMotor().turnOn();
    }
}
