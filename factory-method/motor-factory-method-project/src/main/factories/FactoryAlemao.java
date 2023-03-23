package main.factories;

import main.motors.Motor;
import main.motors.MotorAluminio;

public class FactoryAlemao extends Factory {

    @Override
    public Motor createMotor() {
        return new MotorAluminio();
    }
}
