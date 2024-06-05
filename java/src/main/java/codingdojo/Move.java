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
}
