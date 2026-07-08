
import junit.framework.TestCase;

/**
 * Provides tests for ChessBoard class
 * @author emaph
 */
public class ChessBoardTest extends TestCase {
    
    public void testCreate() {
        ChessBoard board = new ChessBoard();
        assertEquals(0, board.getNumberOfPieces());
    }
    
    public void testAddPawns() {
        ChessBoard board = new ChessBoard();
        board.addPawn(new Pawn(Pawn.WHITE));
        assertEquals(1, board.getNumberOfPieces());
        board.addPawn(new Pawn(Pawn.BLACK));
        assertEquals(2, board.getNumberOfPieces());
    }
}
