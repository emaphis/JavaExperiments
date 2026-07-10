
package sis.report;

import java.util.ArrayList;
import studentinfo.CourseSession;
import studentinfo.Student;

/**
 *
 * @author emaph
 */
public class RosterReporter {

    private final CourseSession session;
    //private ArrayList<Student> students = new ArrayList<Student>();

    static final String NEWLINE = System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "———-" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

    public RosterReporter(CourseSession session) {
        this.session = session;

    }

    String getReport() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(session.getNumberOfStudents());
        buffer.append(NEWLINE);

        return buffer.toString();
    }
}
