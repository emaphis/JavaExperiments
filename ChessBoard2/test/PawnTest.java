
import junit.framework.TestCase;

/**
 * Test Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {
    
    public void testCreate() {
        final String whiteColor = "white";
        Pawn whitePawn = new Pawn(whiteColor);
        assertEquals(whiteColor, whitePawn.getColor());
        
        final String blackColor = "black";
        Pawn blackPawn = new Pawn("black");
        assertEquals(blackColor, blackPawn.getColor());
        
        assertEquals(whiteColor, whitePawn.getColor());
    }
    
}
