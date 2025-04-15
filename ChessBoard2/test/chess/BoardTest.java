package chess;



import pieces.Pawn;
import junit.framework.TestCase;

/**
 * Unit tests for Board class.
 * @author emaph
 */
public class BoardTest extends TestCase {
    private Board board;

    @Override
    protected void setUp() {
        board = new Board();
    }

    public void testCreateBoard() {
        assertEquals(0, board.getNumberPieces());
    }

    public void testAddPiece() {
        Pawn pawn1 = new Pawn();  // white
        board.addPiece(pawn1);
        assertEquals(1, board.getNumberPieces());
        assertEquals(Pawn.WHITE, board.getPiece(0).getColor());

        Pawn pawn2 = new Pawn(Pawn.BLACK);
        board.addPiece(pawn2);
        assertEquals(2, board.getNumberPieces());
        assertEquals(Pawn.BLACK, board.getPiece(1).getColor());
    }
}
