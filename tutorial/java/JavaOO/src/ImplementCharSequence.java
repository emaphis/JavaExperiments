
/**
 * Implement CharSequence
 * @author emaph
 */
public class ImplementCharSequence implements CharSequence {

    private final String sequence;

    public ImplementCharSequence(String sequence) {
        this.sequence = reverseString(sequence);
    }

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return sequence.substring(start, end);
    }

    @Override
    public String toString() {
        return sequence;
    }

    private String reverseString(String input) {
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        builder.reverse();
        return builder.toString();
    }


    public static void main(String[] args) {
        CharSequence seq = new ImplementCharSequence("Write a class that implements the CharSequence interface found in the java.lang package.");

        System.out.println("Length of sequence: " + seq.length());

        // test charAt(int)
        for (int i = 0; i < seq.length(); i++) {
            System.out.print(seq.charAt(i));
        }
        System.out.println();

        // test subSequence
        CharSequence subSeq = seq.subSequence(1, 8);

        // try out toString
        System.out.println("SubSequence: " + subSeq);
    }
}
