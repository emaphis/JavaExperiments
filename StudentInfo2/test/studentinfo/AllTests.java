package studentinfo;

import junit.framework.TestSuite;

/**
 * Run all the tests for the module
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
       TestSuite suite = new TestSuite();
       suite.addTestSuite(StudentTest.class);
       suite.addTestSuite(CourseSessionTest.class);
       return suite;
    }
}
 