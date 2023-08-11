
/**
 * A palindrome is a word or sentence that is symmetric—it is spelled the same
 * forward and backward, ignoring case and punctuation. Here is a short and
 * inefficient program to reverse a palindrome string. It invokes the String
 * method charAt(i), which returns the ith character in the string, counting
 * from 0.
 * @author emaph
 */
public class StringsDemo {
    public static void main(String[] args) {

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original strin in an array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
