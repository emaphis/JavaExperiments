package studentinfo;

import java.util.ArrayList;
import java.util.Date;
import junit.framework.TestCase;

/**
 * Tests a Course Session
 * @author emaph
 */
public class CourseSessionTest extends TestCase {
    private CourseSession session;

    @Override
    public void setUp() {
        session = new CourseSession("ENGL", "101");
    }
    
    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        
        CourseSession mathSession = new CourseSession("MATH", "102");
        assertEquals("MATH", mathSession.getDepartment());
        assertEquals("102", mathSession.getNumber());
        assertEquals(0, mathSession.getNumberOfStudents());
    }
    
    public void testEnrollStudents() {
        assertEquals(0, session.getNumberOfStudents());
        
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
        int year = 103;
        int month = 0;
        int date = 6;
        Date startDate = new Date(year, month, date);

        CourseSession session2 = new CourseSession("ABCD", "200", startDate);

        year = 103;
        month = 3;
        date = 25;
        Date sixteenWeeksOut = new Date(year, month, date);
        assertEquals(sixteenWeeksOut, session2.getEndDate());
    }
}
