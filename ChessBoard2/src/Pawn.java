

/**
 * Represents a Pawn in the ChessBoard
 * @author emaph
 */
class Pawn {
    static final String WHITE = "white";
    static final String BLACK = "black";

    private final String color;

    Pawn(String color) {
        this.color = color;
    }

    Pawn() {
        this.color = Pawn.WHITE;
    }

    String getColor() {
        return color;
    }

}
