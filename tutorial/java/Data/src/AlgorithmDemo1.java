
import java.util.Arrays;
import java.util.List;


/**
 * Exercise 1
 * @author emaph
 */
public class AlgorithmDemo1 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int count = Algorithm1.countIf(li, new UnaryPredicate<Integer>() {
            @Override
            public boolean test(Integer ii) {
                return ii % 2 == 0;
            }
        });
        System.out.println("count = " + count);
    }
}
