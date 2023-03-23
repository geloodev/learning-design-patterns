package main.factories;
import main.motors.Motor;
import main.motors.MotorEletrico;

public class FactoryJapones extends Factory {
    @Override
    public Motor createMotor() {
        return new MotorEletrico();
    }
}
