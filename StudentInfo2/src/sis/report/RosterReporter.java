
package sis.report;

import sis.studentinfo.*;
import static sis.report.ReportConstants.NEWLINE;

/**
 *
 * @author emaph
 */
public class RosterReporter {

    private final CourseSession session;

    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "———-" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

    public RosterReporter(CourseSession session) {
        this.session = session;
    }

    void writeHeader(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_HEADER);
    }

    void writeBody(StringBuilder buffer) {
        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }

    void writeFooter(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(session.getNumberOfStudents());
        buffer.append(NEWLINE);
    }

    public String getReport() {
        StringBuilder buffer = new StringBuilder();

        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);

        return buffer.toString();
    }
}
