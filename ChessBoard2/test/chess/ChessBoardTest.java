package chess;

import java.util.ArrayList;
import pieces.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class ChessBoardTest extends TestCase {

    public ChessBoardTest(String testName) {
        super(testName);
    }

    ChessBoard board;

    @Override
    protected void setUp() throws Exception {
        board = new ChessBoard();
    }

    public void testCreate() {
        assertEquals(16, board.getNumPieces());
        assertEquals("........", board.getRankRepresentation(board.rank1));
        assertEquals("pppppppp", board.getRankRepresentation(board.rank2));
        assertEquals("........", board.getRankRepresentation(board.rank3));
        assertEquals("........", board.getRankRepresentation(board.rank4));
        assertEquals("........", board.getRankRepresentation(board.rank5));
        assertEquals("........", board.getRankRepresentation(board.rank6));
        assertEquals("PPPPPPPP", board.getRankRepresentation(board.rank7));
        assertEquals("........", board.getRankRepresentation(board.rank8));
        System.out.println(board.getBoardRepresentation());
    }

}
