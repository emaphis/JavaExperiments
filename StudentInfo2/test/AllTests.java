
import sis.studentinfo.StudentTest;
import sis.studentinfo.CourseSessionTest;
import sis.report.RosterReporterTest;
import sis.studentinfo.DateUtilTest;
import junit.framework.TestSuite;

/**
 * Run all tests for application
 * @author emaph
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReporterTest.class);
        suite.addTestSuite(DateUtilTest.class);
        return suite;
    }
}
