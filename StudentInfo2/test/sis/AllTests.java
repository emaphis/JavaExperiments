package sis;

import junit.framework.TestSuite;
import sis.report.CourseReportTest;
import sis.studentinfo.*;
import sis.report.RosterReportTest;
import utility.DateUtilTest;

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
        suite.addTestSuite(DateUtilTest.class);
        suite.addTestSuite(CourseReportTest.class);
        return suite;
    }

}
