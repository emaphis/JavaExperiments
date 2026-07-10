package sis.studentinfo;

import java.util.*;
import junit.framework.TestCase;
import utility.DateUtil;

/**
 *
 * @author emaph
 */
public class CourseSessionTest extends TestCase {

    public CourseSessionTest(String testName) {
        super(testName);
    }

    private CourseSession session;
    private Date startDate;

    @Override
    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    public void testCreate() {
        CourseSession session3 = new CourseSession("ENGL", "101", startDate);
        assertEquals("ENGL", session3.getDepartment());
        assertEquals("101", session3.getNumber());
        assertEquals(0, session3.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    public void testEnrollStudents() {
        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

}
