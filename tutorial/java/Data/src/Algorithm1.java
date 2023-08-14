
import java.util.Collection;


/**
 * Exercise 1
 * @author emaph
 */
public class Algorithm1 {
    public static <T> int countIf(Collection<T> col, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : col) {
            if (p.test(elem)) {
                count++;
            }
        }
        return count;
    }

}
