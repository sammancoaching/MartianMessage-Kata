package codingdojo;

import org.apache.commons.lang3.ThreadUtils;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // create an instance of the stepper class with suitable pins set up
        Stepper stepper = new Stepper(8, 10, 9, 11, ThreadUtils::sleepQuietly);

        // configure the stepper motor speed in RPM
        stepper.setSpeed(10);

        // move the motor the number of steps indicated by val
        int val = 42;
        stepper.move_clockwise(val);

        // wait for the stepper to finish moving
        while (stepper.isRunning()) {
            sleep(100);
        }
    }
}
