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
    Pawn pawnB = new Pawn(Pawn.BLACK);
    Pawn pawnW = new Pawn(Pawn.WHITE);

    @Override
    protected void setUp() throws Exception {
        board = new ChessBoard();
    }


    public void testCreate() {
        assertEquals(0, board.getNumPieces());
    }

    public void testAddPieces() {
        board.addPawn(pawnB);
        assertEquals(1, board.getNumPieces());

        board.addPawn(pawnW);
        assertEquals(2, board.getNumPieces());

        ArrayList<Pawn> pawns = board.getPawnList();
        assertEquals(pawnB.getColor(), pawns.get(0).getColor());
        assertEquals(pawnW.getColor(), pawns.get(1).getColor());
    }
}
