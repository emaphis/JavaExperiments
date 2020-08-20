
package boards;

/**
 *
 * @author emaphis
 */
public abstract class Player {
    protected PieceType piece;
    protected Board board;

    public Player(Board board, PieceType piece) {
        this.board = board;
        this.piece = piece;
    }

    public abstract void play();
}
