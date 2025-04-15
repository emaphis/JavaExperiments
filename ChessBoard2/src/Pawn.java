

/**
 * Represents a Pawn in the ChessBoard
 * @author emaph
 */
class Pawn {
    static final String WHITE = "white";
    static final String BLACK = "black";

    private final String color;

    /**
     * Create a Pawn of a given color.
     * @param color
     */
    Pawn(String color) {
        this.color = color;
    }

    /**
     * Create a default (white) Pawn
     */
    Pawn() {
        this.color = Pawn.WHITE;
    }

    /**
     * @return Pawn's color
     */
    String getColor() {
        return color;
    }

}
