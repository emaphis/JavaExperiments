

package sis.report;

import junit.framework.TestCase;
import java.util.*;
import studentinfo.*;

/**
 *
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public RosterReportTest(String testName) {
        super(testName);
    }

    public void testRosterReport() {
        CourseSession session = new CourseSession("ENGL", "101", createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
        String rosterReport = new RosterReporter(session).getReport();
        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER
                + "A" + RosterReporter.NEWLINE
                + "B" + RosterReporter.NEWLINE
                + RosterReporter.ROSTER_REPORT_FOOTER + "2"
                + RosterReporter.NEWLINE, rosterReport);
    }

    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
