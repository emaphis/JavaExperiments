
import studentinfo.StudentTest;
import studentinfo.CourseSessionTest;
import junit.framework.TestSuite;
import studentinfo.RosterReporterTest;

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
        return suite;
    }
}
