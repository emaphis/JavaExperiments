package chess;


import pieces.PawnTest;
import junit.framework.TestSuite;

/**
 * Run all the test in the project.
 *
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(ChessBoardTest.class);
        suite.addTestSuite(PawnTest.class);
        return suite;
    }

}
