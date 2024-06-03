package codingdojo;

import org.lambda.query.Queryable;

public class HexTranslator {
    public static Queryable<Ascii> toHex(String message) {
        var charArray = message.chars().mapToObj(c -> (Integer)(c));
        return Queryable.of(charArray).select(c -> new Ascii(c));
    }
}
