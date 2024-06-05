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

    public int getFirstHexValue() {
        var hex = toString();
        return Integer.parseInt(hex.substring(0, 1), 16);

    }

    public int getSecondHexValue() {
        var hex = toString();
        return Integer.parseInt(hex.substring(1), 16);
    }
}
