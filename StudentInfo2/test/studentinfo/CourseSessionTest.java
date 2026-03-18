package studentinfo;

import java.util.*;
import junit.framework.TestCase;

/**
 * Tests a Course Session
 * @author emaph
 */
public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;

    @Override
    public void setUp() {
        startDate = createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
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
    };
    
    public void testCourseDates() {
        Date sixteenWeeksOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONDAY, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
