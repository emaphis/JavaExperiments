
import studentinfo.StudentTest;
import studentinfo.CourseSessionTest;
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
        return suite;
    }
}
