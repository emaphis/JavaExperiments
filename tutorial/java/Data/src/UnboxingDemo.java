
import java.util.ArrayList;
import java.util.List;

/**
 * Boxing and unboxing
 * @author emaph
 */
public class UnboxingDemo {
    public static void main(String[] args) {
        Integer ii = -8;  // self boxed

        List<Integer> li = new ArrayList<>();
        li.add(ii);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(li.get(0));

        System.out.println("abs = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);

        // 2. Unboxing through assignment
        double phi = ld.get(0);
        System.out.println("phi = " + phi);
    }

    private static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
