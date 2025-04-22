package pieces;


import junit.framework.TestCase;

/**
 * Test cases for Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

    public void testCreate() {
        Pawn firstPawn = new Pawn();
        assertEquals(Pawn.WHITE, firstPawn.getColor());
        assertEquals('p', firstPawn.getRepresentation());

        Pawn secondPawn = new Pawn(Pawn.BLACK, 'P');
        assertEquals(Pawn.BLACK, secondPawn.getColor());
        assertEquals('P', secondPawn.getRepresentation());

        assertEquals(Pawn.WHITE, firstPawn.getColor());
    }

}
