/**
 * Gets two strings from the command line, converts them to numbers, and
 * performs arithmetic operations on the values:
 * @author emaph
 */
public class ValueDemo {
    public static void main(String[] args) {
        // this program requres two
        // argumentf on the command line
        if (args.length == 2) {
            // convert the strings to numbers
            float a = Float.valueOf(args[0]);
            float b = Float.valueOf(args[1]);

            // dp sp,e arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program requites two command-line arguments.");
        }
    }
}
