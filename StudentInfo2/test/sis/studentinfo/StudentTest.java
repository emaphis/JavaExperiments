package sis.studentinfo;


import sis.studentinfo.Student;
import junit.framework.TestCase;

/**
 * Test cases for Student class.
 * @author emaph
 */
public class StudentTest extends TestCase {

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
