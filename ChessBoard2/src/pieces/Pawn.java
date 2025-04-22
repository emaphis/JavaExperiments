package pieces;



/**
 * Represents a Pawn in the ChessBoard
 * @author emaph
 */
public class Pawn {
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private final String color;
    private final char representation;

    /**
     * Create a Pawn of a given color.
     * @param color
     */
    public Pawn(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    /**
     * Create a default (white) Pawn
     */
    public Pawn() {
        this.color = Pawn.WHITE;
        this.representation = 'p';
    }

    /**
     * @return Pawn's color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return Pieces representation
     */
    public char getRepresentation() {
        return representation;
    }

}
