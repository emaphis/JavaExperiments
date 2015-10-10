
package class_features;
import java.util.List;

/**
 *
 * Classes should have strong cohesion
 */
public class StudentReport {
    
    public void printStudentGrades(Student[] students) {
        for (Student student : students) {
            System.out.println("Final grade for " + student.getName() + " is " +
                                student.getAverage());
        }
    }
}
