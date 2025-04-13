
import junit.framework.TestCase;

/**
 * Test cases for Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

    public void testCreate() {
        final String firstColor = "white";
        Pawn firstPawn = new Pawn(firstColor);
        assertEquals(firstColor, firstPawn.getColor());

        final String secondColor = "black";
        Pawn secondPawn = new Pawn(secondColor);
        assertEquals(secondColor, secondPawn.getColor());

        assertEquals(firstColor, firstPawn.getColor());
    }

}
