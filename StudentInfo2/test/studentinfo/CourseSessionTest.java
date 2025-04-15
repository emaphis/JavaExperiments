package studentinfo;

import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;

    @Override
    protected void setUp() {
        int year = 103;
        int month = 0;
        int date = 6;
        startDate = new Date(year, month, date);
        session = new CourseSession("ENGL", "101", startDate);
    }


    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    public void testEnrollStudents() {
        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        Student student2 = new Student("Coralee DeVaugn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        int year = 103;
        int month = 3;
        int date = 25;
        Date sixteenWeeksOut = new Date(year, month, date);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }
}
