
import java.util.Arrays;
import java.util.List;


/**
 * Upper bounded generics
 * @author emaph
 */
public class UpperBoundedDemo {

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number num : list) {
            s += num.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(li));
        System.out.println("sum = " + sumOfList(ld));
    }
}
