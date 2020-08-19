package boards;


public enum PieceType {
    NONE(' '),
    X('X'),
    O('O'),
    ERROR('E');

    private final char piece;

    private PieceType(char piece) {
        this.piece = piece;
    }

    public char getPiece() {
        return piece;
    }
}
