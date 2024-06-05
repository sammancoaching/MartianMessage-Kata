package codingdojo;

import org.apache.commons.lang3.mutable.Mutable;
import org.lambda.query.Queryable;

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
    private int speed;

    public Stepper(){
        this(8, 9, 10, 11);
    }

    public Stepper(int pin1, int pin2, int pin3, int pin4) {
        speed = 10;
        // logic related to the pins is omitted in this exercise
    }

    public static Queryable<Move> getMovesFor(Queryable<codingdojo.Ascii> hex, int startingPosition) {
        Queryable<Move> moves = Queryable.of();
        for (Ascii ascii : hex) {
            Move move = getMoveFor(ascii, startingPosition);
            startingPosition = move.getEndingPosition();
            moves.add(move);
        }
        return moves;
    }

    private static Move getMoveFor(Ascii ascii, int startingPosition) {
        int first = toPosition(ascii.getFirstHexValue()) - startingPosition;
        int currentPosition = startingPosition + first;
        int second = toPosition(ascii.getSecondHexValue());
        return new Move(first, second - currentPosition, startingPosition);
    }

    private static int toPosition(int ascii) {
        return ascii + 1;
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
        // logic to activate the relevant pins is omitted in this exercise
    }
    public void move_anticlockwise(int steps) {
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
}
