package main.factories;
import main.motors.Motor;

public abstract class Factory {

    public abstract Motor createMotor();
    
    public void getMotor() {
        Motor motor = createMotor();
        motor.turnOn();
    }
}
