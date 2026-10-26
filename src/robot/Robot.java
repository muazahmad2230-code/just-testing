
import subsystems.intake.Intake;

public class Robot {
    
    public Intake intakeInit;

    public Robot() {
        this.intakeInit = new Intake();
    }

    public void test() {
        this.intakeInit.printMotors();
        this.intakeInit.superPrintMotors();
    }
}