

package sis.report;

import java.util.*;
import sis.studentinfo.*;
import static sis.report.ReportConstants.NEWLINE;

/**
 *
 * @author emaph
 */
class CourseReport {

    private ArrayList<CourseSession> sessions
            = new ArrayList<CourseSession>();

    public CourseReport() {
    }

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        Collections.sort(sessions);
        StringBuilder builder = new StringBuilder();
        for (CourseSession session : sessions) {
            builder.append(session.getDepartment());
            builder.append(" ");
            builder.append(session.getNumber());
            builder.append(NEWLINE);
        }
        return builder.toString();
    }

}
