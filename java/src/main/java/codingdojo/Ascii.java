package codingdojo;

public class Ascii {
    private int value;

    public Ascii(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%02X", value);
    }
}
