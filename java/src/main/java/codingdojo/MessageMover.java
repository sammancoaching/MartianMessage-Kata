package codingdojo;

import org.lambda.query.Queryable;

public class MessageMover {
    public static Queryable<Move> getMovesFor(Queryable<Ascii> hex, int startingPosition) {
        Queryable<Move> moves = Queryable.of();
        for (Ascii ascii : hex) {
            Move move = getMoveFor(ascii, startingPosition);
            startingPosition = move.getEndingPosition();
            moves.add(move);
        }
        moves.add(new EndOfMessage());
        return moves;
    }

    public static Move getMoveFor(Ascii ascii, int startingPosition) {
        int first = toPosition(ascii.getFirstHexValue()) - startingPosition;
        int currentPosition = startingPosition + first;
        int second = toPosition(ascii.getSecondHexValue());
        return new Move(first, second - currentPosition, startingPosition);
    }

    public static int toPosition(int flagValue) {
        return flagValue + 1;
    }
}
