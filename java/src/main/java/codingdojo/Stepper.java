package codingdojo;

import com.spun.util.logger.SimpleLogger;
import org.apache.commons.lang3.ThreadUtils;
import org.lambda.actions.Action1;

import java.time.Duration;

/**
 * This class is a placeholder for a real object that would be able to
 * control an electric stepper motor.
 */
public class Stepper {
    /**
     * the number of steps to rotate a complete circle of 360 degrees
     */
    public static final int STEPS = 2048;

    /**
     * speed of the motor in RPM
     */
    public static final int MAX_SPEED = 15;
    private final Action1<Duration> sleeper;
    private int speed;
    private Action1<Duration> sleep;

    public int getCurrentStep() {
        return currentStep;
    }

    private int currentStep = 0;

    public Stepper() {
        this(8, 9, 10, 11, ThreadUtils::sleepQuietly);

    }

    public Stepper(Action1<Duration> sleepQuietly) {
        this(8, 9, 10, 11, sleepQuietly);

    }

    public Stepper(int pin1, int pin2, int pin3, int pin4, Action1<Duration> sleepQuietly) {
        speed = 10;
        // logic related to the pins is omitted in this exercise
        sleeper = sleepQuietly;
    }

    /**
     * Set the speed of the motor in RPM. Maximum is defined above.
     */
    void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * move the indicated number of steps clockwise.
     * The size of a step is defined above.
     */
    public void move_clockwise(int steps) {
        currentStep += steps;
        SimpleLogger.event("Moving " + steps + " clockwise");
        // logic to activate the relevant pins is omitted in this exercise
    }

    public void move_anticlockwise(int steps) {
        currentStep -= steps;
        SimpleLogger.event("Moving " + steps + " counterclockwise");
        // logic to activate the relevant pins is omitted in this exercise
    }

    /**
     * Whether the motor is currently running.
     * Motors that are moving should not be given new instructions.
     */
    public boolean isRunning() {
        // logic to read the pins and determine this omitted in this exercise
        return false;
    }


    public void waitTime(int milliseconds) {
        Duration duration = Duration.ofMillis(milliseconds);
        sleeper.call(duration);
        SimpleLogger.event("Sleeping " + duration.getSeconds() + " seconds");


    }


}
