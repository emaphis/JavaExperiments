package pieces;



/**
 *
 * @author emaph
 */
public class Piece {

    public enum Color { WHITE, BLACK, NONE }

    // Piece names constants
    public static enum Type {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE
    };

    private final Color color;
    private final Type type;

    private static int whiteCount = 0;
    private static int blackCount = 0;

    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
        //this.type = getType(representation);
    }

    /**
     * Create a Piece given a color and a representation
     *
     * @param color
     * @param type
     * @return a Piece
     */
    public static Piece create(Color color, Type type) {
        Piece piece = new Piece(color, type);
        pieceCount(color);
        return piece;
    }

    /**
     * Return Piece Type given a Representation.
     *
     * @param representation
     * @return
     */
    private Type getType(char representation) {
        Type Piecetype;
        char rep = Character.toLowerCase(representation);
        if (rep == 'p')      Piecetype = Type.PAWN;
        else if (rep == 'n') Piecetype = Type.KNIGHT;
        else if (rep == 'r') Piecetype = Type.ROOK;
        else if (rep == 'b') Piecetype = Type.BISHOP;
        else if (rep == 'q') Piecetype = Type.QUEEN;
        else if (rep == 'k') Piecetype = Type.KING;
        else Piecetype = Type.NO_PIECE;

        return Piecetype;
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
     * Return the char representation of Piece
     *
     * @return char representation
     */
    public char getRepresentation() {
        char rep;
        if (type == Type.PAWN)        rep = 'p';
        else if (type == Type.KNIGHT) rep = 'n';
        else if (type == Type.BISHOP) rep = 'b';
        else if (type == Type.ROOK)   rep = 'r';
        else if (type == Type.QUEEN)  rep = 'q';
        else if (type == Type.KING)   rep = 'k';
        else  rep = '.';

        if (color  == Color.BLACK) {
            rep = Character.toUpperCase(rep);
        }

        return rep;
    }

    private static void pieceCount(Color color) {
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
