package studentinfo;

import junit.framework.TestSuite;
import sis.report.RosterReportTest;

/**
 *
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class );
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReportTest.class);
        return suite;
    }

}
