package pieces;



/**
 *
 * @author emaph
 */
public class Pawn {
    private final String color;
    private final char representation;

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final String EMPTY = "none"; // Empty Pawn represents emtpy square.

    public Pawn(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public Pawn() {
        this.color = WHITE;
        this.representation = 'p';
    }

    public String getColor() {
        return color;
    }

    /**
     * Return the char representation if P
     *
     * @return char representation
     */
    public char getRepresentation() {
        return representation;
    }

}
