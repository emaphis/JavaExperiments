
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class CourseSessionTest extends TestCase {
    
    public CourseSessionTest(String testName) {
        super(testName);
    }
    
    public void testCreate() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
          assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        
        CourseSession session2 = new CourseSession("MATH", "102");
        assertEquals("MATH", session2.getDepartment());
        assertEquals("102", session2.getNumber());
        assertEquals(0, session2.getNumberOfStudents());
    }

    public void testEnrollStudents() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals(0, session.getNumberOfStudents());
        
        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        ArrayList<Student> allStudents = session.getAllStudents();
        assertEquals(1, allStudents.size());
        assertEquals(student1, allStudents.get(0));
        
        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(2, allStudents.size());
        assertEquals(student1, allStudents.get(0));
        assertEquals(student2, allStudents.get(1));
    }
}
