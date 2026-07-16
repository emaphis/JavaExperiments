package pieces;



/**
 *
 * @author emaph
 */
public class Piece {

    public enum Color { WHITE, BLACK, NONE }
    private final Color color;
    private final String name;

    private static int whiteCount = 0;
    private static int blackCount = 0;

    public static final String PAWN = "pawn";
    public static final String KNIGHT = "knight";
    public static final String ROOK = "rook";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";

    private Piece(Color color, char representation) {
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
    public static Piece create(Color color, char representation) {
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

    public Color getColor() {
        return color;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public boolean isBlack() {
        return color  == Color.BLACK;
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

        if (color  == Color.BLACK) {
            rep = Character.toUpperCase(rep);
        }

        return rep;
    }

    private static void pieceCount(Color color, char rep) {
        if (color == Color.WHITE) {
            ++whiteCount;
        } else if (color == Color.BLACK) {
            ++blackCount;
        }
    }

    public static int getPieceCount(Color color) {
        if (color == Color.WHITE) {
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
