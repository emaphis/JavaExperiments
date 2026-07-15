package chess;

import java.util.ArrayList;
import pieces.Piece;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class ChessBoardTest extends TestCase {

    public ChessBoardTest(String testName) {
        super(testName);
    }

    private ChessBoard board;

    @Override
    protected void setUp() throws Exception {
        board = new ChessBoard();
    }

    public void testCreate() {
        board.initialize();
        assertEquals(32, board.pieceCount());
        assertEquals(16, Piece.getPieceCount(Piece.WHITE));
        assertEquals(16, Piece.getPieceCount(Piece.BLACK));

        String boardRep
                = "RNBQKBNR" + "\n"
                + "PPPPPPPP" + "\n"
                + "........" + "\n"
                + "........" + "\n"
                + "........" + "\n"
                + "........" + "\n"
                + "pppppppp" + "\n"
                + "rnbqkbnr" + "\n";
        assertEquals(boardRep, board.print());
        System.out.println(board.print());
    }

}
