package main.factories;

import main.motors.Motor;
import main.motors.MotorAco;

public class FactoryBrasileiro extends Factory {
    @Override
    public Motor createMotor() {
        return new MotorAco();
    }
}
