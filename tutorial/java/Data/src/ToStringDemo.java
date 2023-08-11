
/**
 * Uses the toString method to convert a number to a string. The program then
 * uses some string methods to compute the number of digits before and after the
 * decimal point:
 * @author emaph
 */
public class ToStringDemo {
    public static void main(String[] args) {
        double d = 885.48;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits before decimal point");
        System.out.println((s.length() - dot - 1) + " digits after decimal point.");
    }
}
