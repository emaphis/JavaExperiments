

package sis;

import sis.studentinfo.*;
import sis.report.*;
import utility.DateUtil;

/**
 * This Student Application
 * @author emaph
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Processing Students ...");

        System.out.println();
        CourseSession session = new CourseSession("ENGL", "101", DateUtil.createDate(2003, 1, 6));
        session.enroll(new Student("Cain DiVoe"));
        session.enroll(new Student("Coralee DeVaughn"));
        session.enroll(new Student("Joe Bloe"));
        session.enroll(new Student("Jane Doe"));

        String rosterReport = new RosterReporter(session).getReport();
        System.out.println(rosterReport);
        System.out.println();

        System.out.println("Done!");
    }

}
