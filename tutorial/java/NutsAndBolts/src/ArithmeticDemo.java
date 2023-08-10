
/**
 * Tests the arithmetic operators.
 * @author emaph
 */
class ArithmeticDemo {

    public static void main(String args[]) {

        // result is 3
        int result = 1 + 2;
        System.out.println(result);

        // result is now 2
        result = result - 1;
        System.out.println(result);

        // result is now 4
        result = result * 2;
        System.out.println(result);

        // result is now 2
        result = result / 2;
        System.out.println(result);

        // result is now 10
        result = result + 8;
        System.out.println(result);

        // result is now 3
        result = result % 7;
        System.out.println(result);
    }
}
