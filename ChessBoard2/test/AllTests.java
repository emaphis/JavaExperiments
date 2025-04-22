
import chess.BoardTest;
import pieces.PawnTest;
import pieces.CharacterTest;
import junit.framework.TestSuite;


/**
 *
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        suite.addTestSuite(CharacterTest.class);
        return suite;
    }
}
