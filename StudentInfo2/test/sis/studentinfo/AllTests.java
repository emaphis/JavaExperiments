package sis.studentinfo;

import sis.report.*;
import junit.framework.TestSuite;

/**
 *
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(DateUtilTest.class);
        suite.addTestSuite(StudentTest.class);
        return suite;
    }

}
