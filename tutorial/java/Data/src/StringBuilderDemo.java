
/**
 * Convert the palindrome string to a string builder, you can use the reverse()
 * method in the StringBuilder class.
 * @author emaph
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";

        StringBuilder sb = new StringBuilder(palindrome);

        sb.reverse();

        System.out.println(sb);
    }
}
