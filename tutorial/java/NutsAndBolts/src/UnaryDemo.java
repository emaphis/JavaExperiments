
/**
 * Tests the unary operators.
 * @author emaph
 */
class UnaryDemo {
    public static void main(String args[]) {

        // result is 1
        int result =+ 1;
        System.out.println(result);

        // result is now 0
        result--;
        System.out.println(result);

        // result is now 1
        result++;
        System.out.println(result);

        // result is now -1
        result =- result;
        System.out.println(result);

        // result is now false
        boolean success = false;
        System.out.println(success);

        // result is now true
        System.out.println(!success);
    }
}
