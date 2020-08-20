
package boards;


/**
 *
 * @author emaphis
 */
public class MediumPlayer extends EasyPlayer {

    public MediumPlayer(Board board, PieceType piece) {
        super(board, piece);
    }

    @Override
    public void play() {
        // rows
        if (checkTwo(piece, 1, 3,  2, 3,  3, 3)) { return; }
        if (checkTwo(piece, 1, 2,  2, 2,  3, 2)) { return; }
        if (checkTwo(piece, 1, 1,  2, 1,  3, 1)) { return; }

        // columns
        if (checkTwo(piece, 1, 3,  1, 2,  1, 1)) { return; }
        if (checkTwo(piece, 2, 3,  2, 2,  2, 1)) { return; }
        if (checkTwo(piece, 3, 3,  3, 2,  3, 1)) { return; }

        // diagonals
        if (checkTwo(piece, 1, 3,  2, 2,  3, 1)) { return; }
        if (checkTwo(piece, 1, 1,  2, 2,  3, 3)) { return; }

        super.play(); // Play radom cell.
    }

    private boolean checkTwo(PieceType piece, int col1, int row1, int col2, int row2, int col3, int row3) {
        if (board.get(col1, row1).isType(piece) && board.get(col2, row2).isType(piece) &&  board.get(col3, row3).isEmpty() ) {
            board.put(new Cell(piece), col3, row3);
            return true;
        }

        if (board.get(col1, row1).isType(piece) && board.get(col2, row2).isEmpty() &&  board.get(col3, row3).isEmpty() ) {
            board.put(new Cell(piece), col2, row2);
            return true;
        }

        if (board.get(col1, row1).isEmpty() && board.get(col2, row2).isType(piece) &&  board.get(col3, row3).isType(piece)) {
            board.put(new Cell(piece), col1, row1);
            return true;
        }

        return false;
    }

}
