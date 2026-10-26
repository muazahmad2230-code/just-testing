package src.robot.subsystems;

public class Subsystem {
    double speed = 1.0;
    String[] motors = {"motor1", "motor2"};
    String frontLeft;
    String frontRight;
    int count;
    public Subsystem(int count) {
        this.frontLeft = this.motors[0];
        this.frontRight = this.motors[1];
        this.count = count;
    }
    
    public void printMotors(){
        for(int i = 0; i < motors.length; ++i) {
            System.out.println(motors[i]);
        }
    }
}
