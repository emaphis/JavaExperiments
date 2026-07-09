
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
        super(testName);
    }
    
    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);
        assertEquals(firstStudentName, firstStudent.getName());
        
        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());
        
        assertEquals(firstStudentName, firstStudent.getName());
    }
}
