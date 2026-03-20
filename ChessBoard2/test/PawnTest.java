
import junit.framework.TestCase;

/**
 * Test Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {
    
    public void testCreate() {
        Pawn whitePawn = new Pawn(Pawn.WHITE);
        assertEquals(Pawn.WHITE, whitePawn.getColor());

        Pawn blackPawn = new Pawn(Pawn.BLACK);
        assertEquals(Pawn.BLACK, blackPawn.getColor());
        
        assertEquals(Pawn.WHITE, whitePawn.getColor());
    }
    
    public void testCreateBlankPawn() {
        Pawn blank = new Pawn();
        assertEquals(Pawn.BLANK, blank.getColor());
    }
}
