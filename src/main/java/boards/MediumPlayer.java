
package boards;


/**
 *
 * @author emaphis
 */
public class MediumPlayer extends EasyPlayer {

    public MediumPlayer(Board board, PieceType pieceType) {
        super(board, pieceType);
    }

    @Override
    public void play() {
        // rows
        if (board.countLine(getPieceType(), board.get(1, 3), board.get(2, 3), board.get(3, 3)) == 2) {
            placeOnEmpty(1, 3,  2, 3,  3, 3);
            return;
        }
        if (board.countLine(getPieceType(), board.get(1, 2), board.get(2, 2), board.get(3, 2)) == 2) {
            placeOnEmpty(1, 2,  2, 2,  3, 2);
            return;
        }
        if (board.countLine(getPieceType(), board.get(1, 1), board.get(2, 1), board.get(3, 1)) == 2) {
            placeOnEmpty(1, 1,  2, 1,  3, 1);
            return;
        }

        // columns
        if (board.countLine(getPieceType(), board.get(1, 3), board.get(1, 2), board.get(1, 1)) == 2) {
            placeOnEmpty(1, 3,  1, 2,  1, 1);
            return;
        }
        if (board.countLine(getPieceType(), board.get(2, 3), board.get(2, 2), board.get(2, 1)) == 2) {
            placeOnEmpty(2, 3,  2, 2,  2, 1);
            return;
        }
        if (board.countLine(getPieceType(), board.get(3, 3), board.get(3, 2), board.get(3, 1)) == 2) {
            placeOnEmpty(3, 3,  3, 2,  3, 1);
            return;
        }

        // diagonals
        if (board.countLine(getPieceType(), board.get(1, 3), board.get(2, 2), board.get(3, 1)) == 2) {
            placeOnEmpty(1, 3,  2, 2,  3, 1);
            return;
        }
        if (board.countLine(getPieceType(), board.get(1, 1), board.get(2, 2), board.get(3, 3)) == 2) {
            placeOnEmpty(1, 1,  2, 2,  3, 3);
            return;
        }

        super.play(); // Play radom cell.
    }

    private void placeOnEmpty(int col1, int row1, int col2, int row2, int col3, int row3) {
        if (board.get(col1, row1).isEmpty()) {
            board.put(new Cell(getPieceType()), col1, row1);
            return;
        }
        if (board.get(col2, row2).isEmpty()) {
            board.put(new Cell(getPieceType()), col2, row2);
            return;
        }
        if (board.get(col3, row3).isEmpty()) {
            board.put(new Cell(getPieceType()), col3, row3);
            return;
        }
    }

}
