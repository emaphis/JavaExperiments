
/**
 * Strings exercises.
 * @author emaph
 */
public class StringExercise {
    public static void main(String[] args) {
        // Question 1
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Length: " + sb.length() +", Capacity: " + sb.capacity());

        // Question 2
        String hannah = "Did Hannah see bees? Hannah did.";
        // 32, e, 15
        System.out.println("len = " + hannah.length() + ", charAt(12)= " +
                hannah.charAt(12) + ", charAt(15) = " + hannah.charAt(15));

        // Quesion 3
        String sub = "Was it a car or a cat I saw?".substring(9, 12);
        // 3
        System.out.println("sub length = " + sub.length());

        // Exercise 1
        String hi = "Hi, ";
        String mom = "mom";
        System.out.println(hi + mom);
        System.out.println(hi.concat(mom));
    }
}
