package boards;


public enum PieceType {
    NONE(' '),
    X('X'),
    O('O'),
    ERROR('E');

    private final char glyph;

    private PieceType(char glyph) {
        this.glyph = glyph;
    }

    public char getGlyph() {
        return glyph;
    }
}
