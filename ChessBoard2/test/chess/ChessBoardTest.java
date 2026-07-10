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

    public void testCreate() {
        ChessBoard board = new ChessBoard();
        assertEquals(0, board.getNumPieces());
    }

    public void testAddPieces() {
        ChessBoard board = new ChessBoard();
        Pawn pawnB = new Pawn(Pawn.BLACK);
        board.addPawn(pawnB);
        assertEquals(1, board.getNumPieces());

        Pawn pawnW = new Pawn(Pawn.WHITE);
        board.addPawn(pawnW);
        assertEquals(2, board.getNumPieces());

        ArrayList<Pawn> pawns = board.getPawnList();
        assertEquals(pawnB.getColor(), pawns.get(0).getColor());
        assertEquals(pawnW.getColor(), pawns.get(1).getColor());
    }
}
