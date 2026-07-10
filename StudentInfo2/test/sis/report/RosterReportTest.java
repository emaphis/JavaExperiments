

package sis.report;

import sis.studentinfo.Student;
import sis.studentinfo.CourseSession;
import junit.framework.TestCase;
import utility.DateUtil;


/**
 *
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public RosterReportTest(String testName) {
        super(testName);
    }

    public void testRosterReport() {
        CourseSession session = new CourseSession("ENGL", "101", DateUtil.createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
        String rosterReport = new RosterReporter(session).getReport();
        System.out.println(rosterReport);
        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER
                + "A" + RosterReporter.NEWLINE
                + "B" + RosterReporter.NEWLINE
                + RosterReporter.ROSTER_REPORT_FOOTER + "2"
                + RosterReporter.NEWLINE, rosterReport);
    }
}
