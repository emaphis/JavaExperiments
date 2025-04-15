package pieces;


import pieces.Pawn;
import junit.framework.TestCase;

/**
 * Test cases for Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

    public void testCreate() {
        Pawn firstPawn = new Pawn();
        assertEquals(Pawn.WHITE, firstPawn.getColor());

        Pawn secondPawn = new Pawn(Pawn.BLACK);
        assertEquals(Pawn.BLACK, secondPawn.getColor());

        assertEquals(Pawn.WHITE, firstPawn.getColor());
    }

}
