package codingdojo;

public class EndOfMessage extends Move {
    @Override
    public void perform(Stepper stepper) {
        stepper.move_anticlockwise(stepper.getCurrentStep());
    }

    public EndOfMessage() {
        super(0, 0,0);
    }

    @Override
    public String toString() {
        return "[EOM]";
    }
}
