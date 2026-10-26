package subsystems.intake;

import subsystems.Subsystem;

public class Intake extends Subsystem {

    public Intake() {
        super();
    }
    @Override 
    public void printMotors() {
        System.out.println("Hello, successfully Overrode!");
    }
   
}
