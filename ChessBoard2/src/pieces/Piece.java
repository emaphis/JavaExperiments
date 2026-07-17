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

    // Piece reresentation constats (eventuall fold into Type enum)
    public static char PAWN_REPRESENTATION = 'p';
    public static char ROOK_REPRESENTATION = 'r';
    public static char KNIGHT_REPRESENTATION = 'n';
    public static char BISHOP_REPRESENTATION = 'b';
    public static char QUEEN_REPRESENTATION = 'q';
    public static char KING_REPRESENTATION = 'k';
    public static char BLANK_REPRESENTATION = '.';

    private final Color color;
    private final Type type;

    private static int whiteCount = 0;
    private static int blackCount = 0;

    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    /**
     * Create a Piece given a color and a representation
     *
     * @param color
     * @param type
     * @return a Piece
     */
    private static Piece create(Color color, Type type) {
        Piece piece = new Piece(color, type);
        pieceCount(color);
        return piece;
    }

     public static Piece createPawn(Color color) {
        return create(color, Type.PAWN);
    }

    public static Piece createRook(Color color) {
        return create(color, Type.ROOK);
    }

    public static Piece createKnight(Color color) {
        return create(color, Type.KNIGHT);
    }

    public static Piece createBishop(Color color) {
        return create(color, Type.BISHOP);
    }

    public static Piece createQueen(Color color) {
        return create(color, Type.QUEEN);
    }

    public static Piece createKing(Color color) {
        return create(color, Type.KING);
    }


    public static Piece noPiece() {
        return create(Color.NONE, Type.NO_PIECE);
    }

    public Type getType() {
        return type;
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
