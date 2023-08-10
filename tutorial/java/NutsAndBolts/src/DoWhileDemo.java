
/**
 * The statements within the do block are always executed at least once, as
 * shown in the following program
 * @author emaph
 */
class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
