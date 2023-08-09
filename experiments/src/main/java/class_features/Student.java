
package class_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author emaphis
 */
class Student {
    
    private final List<TestScore> testScores;
    private final String name;
    
    public Student(List<TestScore> scores, String name) {
        this.testScores = Collections.unmodifiableList(
                new ArrayList<>(scores));
        this.name  = name;
    }

    String getName() {
        return name;
    }

    List<TestScore> getTestScores() {
        return testScores;
    }

    public int getAverage() {
        int total = 0;
        for (TestScore testScore : testScores) {
            total += testScore.getPercentCorrect();
        }
        return total / testScores.size();
    }

}
