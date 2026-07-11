

package sis.report;

import sis.studentinfo.*;
import junit.framework.TestCase;
import utility.DateUtil;
;
import static sis.report.ReportConstants.NEWLINE;


/**
 *
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public RosterReportTest(String testName) {
        super(testName);
    }

    public void testRosterReport() {
        CourseSession session = CourseSession.create("ENGL", "101", DateUtil.createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
        String rosterReport = new RosterReporter(session).getReport();
        System.out.println(rosterReport);
        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER
                + "A" + NEWLINE
                + "B" + NEWLINE
                + RosterReporter.ROSTER_REPORT_FOOTER + "2"
                + NEWLINE, rosterReport);
    }
}
