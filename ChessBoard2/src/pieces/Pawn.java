package pieces;



/**
 * Represents a Pawn in the ChessBoard
 * @author emaph
 */
public class Pawn {
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private final String color;

    /**
     * Create a Pawn of a given color.
     * @param color
     */
    public Pawn(String color) {
        this.color = color;
    }

    /**
     * Create a default (white) Pawn
     */
    public Pawn() {
        this.color = Pawn.WHITE;
    }

    /**
     * @return Pawn's color
     */
    public String getColor() {
        return color;
    }

}
