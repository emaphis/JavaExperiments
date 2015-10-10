
package class_features;
import java.util.List;

/**
 *
 * Classes should have strong cohesion
 */
public class StudentReport {
    
    public void printStudentGrades(Student[] students) {
        List<TestScore> testScores;
        int total;
        
        for (Student student : students) {
            testScores = student.getTestScores();
            total = 0;
            for (TestScore testScore : testScores) {
                total += testScore.getPercentCorrect();
            }
            System.err.println("Final grade for " + student.getName() + " is " +
                                total / testScores.size());
        }
    }
}
