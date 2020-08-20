
package boards;

import java.util.Random;
import static boards.Board.LEN;

/**
 *
 * @author emaphis
 */
public class EasyPlayer extends Player {
    Random rand;

    public EasyPlayer(Board board, PieceType piece) {
        super(board, piece);
        rand = new Random();
    }

    @Override
    public void play() {
        int numEmpty = board.countEmpty();
        int indx = rand.nextInt(numEmpty);
        int count = 0;

        // find the empty square to play, then play
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                if (board.isEmpty(col, row)) {
                    if (count == indx) {
                        board.put(new Cell(piece), col, row);
                        return;
                    }
                    count++;
                }
            }
        }
    }

}
