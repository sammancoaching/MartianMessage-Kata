package codingdojo;

public class Move {


    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    private final int first;
    private final int second;
    private final int startingPosition;

    public Move(int first, int second, int startingPosition) {
        this.first = first;
        this.second = second;
        this.startingPosition = startingPosition;
    }

    @Override
    public String toString() {
        return String.format("[%s,%s]", first, second);
    }

    public int getEndingPosition() {
        return startingPosition + second + first;
    }
    public static void move(Stepper stepper, int amount) {
        if (0 < amount) {
            stepper.move_clockwise(amount * 120);
        } else {
            stepper.move_anticlockwise(- (amount * 120));
        }
    }

    public void perform(Stepper stepper) {
        move(stepper, getFirst());
        stepper.waitTime(5000);
        move(stepper, getSecond());
        stepper.waitTime(10000);
    }
}
