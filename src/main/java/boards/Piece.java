package boards;


public enum Piece {
    NONE(' '),
    X('X'),
    O('O'),
    ERROR('E');

    private final char piece;

    private Piece(char piece) {
        this.piece = piece;
    }

    public char getPiece() {
        return piece;
    }
}
