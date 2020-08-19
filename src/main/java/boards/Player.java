
package boards;

/**
 *
 * @author emaphis
 */
public abstract class Player {
    private PieceType pieceType;
    protected Board board;

    public Player(Board board, PieceType pieceType) {
        this.board = board;
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public abstract void play();
}
