
/**
 * steps through a String, counting the occurences of the letter "p". If the
 * current character is not a p, the continue statement skips the rest of the
 * loop and proceeds to the next character. If it is a "p", the program
 * increments the letter count.
 * @author emaph
 */
class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + " peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
