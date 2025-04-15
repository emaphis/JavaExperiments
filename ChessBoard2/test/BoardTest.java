

import junit.framework.TestCase;

/**
 * Unit tests for Board class.
 * @author emaph
 */
public class BoardTest extends TestCase {

    public void testCreateBoard() {
        Board board = new Board();
        assertEquals(0, board.getNumberPieces());
    }
}
