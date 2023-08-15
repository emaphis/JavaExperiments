
/**
 * The Root2 example formats two values with a single format invocation:
 * @author emaph
 */
public class Root2 {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n", i, r);
    }
}
