
package boards;

import java.util.Random;

/**
 *
 * @author emaphis
 */
public class EasyPlayer extends Player {
    Random rand;

    public EasyPlayer(Board board, PieceType pieceType) {
        super(board, pieceType);
        rand = new Random();
    }

    @Override
    public void play() {
        int numEmpty = board.countEmpty();
        int indx = rand.nextInt(numEmpty);
        int count = 0;

        // find the empty square to play, then play
        for (int row = board.LEN; row > 0; row--) {
            for (int col = 1; col <= board.LEN; col++) {
                if (board.isEmpty(col, row)) {
                    if (count == indx) {
                        board.put(new Cell(super.getPieceType()), col, row);
                        return;
                    }
                    count++;
                }
            }
        }
    }

}
