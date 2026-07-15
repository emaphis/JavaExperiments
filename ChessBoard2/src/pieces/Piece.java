package pieces;



/**
 *
 * @author emaph
 */
public class Piece {
    private final String color;
    private final String name;

    private static int whiteCount = 0;
    private static int blackCount = 0;

    public static final String PAWN = "pawn";
    public static final String KNIGHT = "knight";
    public static final String ROOK = "rook";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final String EMPTY = "none"; // Empty Piece represents emtpy square.

    private Piece(String color, char representation) {
        this.color = color;
        this.name = getName(representation);
    }

    /**
     * Create a Piece given a color and a representation
     *
     * @param color
     * @param representation
     * @return a Piece
     */
    public static Piece create(String color, char representation) {
        Piece piece = new Piece(color, representation);
        pieceCount(color, representation);
        return piece;
    }

    /**
     * Return Piece Name given a Representation.
     *
     * @param representation
     * @return
     */
    private String getName(char representation) {
        String pieceName;
        char rep = Character.toLowerCase(representation);
        if (rep == 'p') {
            pieceName = PAWN;
        } else if (rep == 'n') {
            pieceName = KNIGHT;
        } else if (rep == 'r') {
            pieceName = ROOK;
        } else if (rep == 'b') {
            pieceName = BISHOP;
        } else if (rep == 'q') {
            pieceName = QUEEN;
        } else if (rep == 'k') {
            pieceName = KING;
        } else {
            pieceName = ".";
        }
        return pieceName;
    }

    public String getColor() {
        return color;
    }

    public boolean isWhite() {
        return color.equals(WHITE);
    }

    public boolean isBlack() {
        return color.equals(BLACK);
    }

    /**
     * Return the char representation if Piece
     *
     * @return char representation
     */
    public char getRepresentation() {
        char rep;
        if (name.equals(PAWN)) {
            rep = 'p';
        } else if (name.equals(KNIGHT)) {
            rep = 'n';
        } else if (name.equals(BISHOP)) {
            rep = 'b';
        } else if (name.equals(ROOK)) {
            rep = 'r';
        } else if (name.equals(QUEEN)) {
            rep = 'q';
        } else if (name.equals(KING)) {
            rep = 'k';
        } else {
            rep = '.';
        }

        if (color.equals(BLACK)) {
            rep = Character.toUpperCase(rep);
        }

        return rep;
    }

    private static void pieceCount(String color, char rep) {
        if (color.equals(Piece.WHITE)) {
            ++whiteCount;
        } else if (color.equals(Piece.BLACK)) {
            ++blackCount;
        }
    }

    public static int getPieceCount(String color) {
        if (color.equals(Piece.WHITE)) {
            return whiteCount;
        } else {
            return blackCount;
        }
    }

    /**
     * Blech
     */
    public static void resetCounters() {
        whiteCount = 0;
        blackCount = 0;
    }
}
