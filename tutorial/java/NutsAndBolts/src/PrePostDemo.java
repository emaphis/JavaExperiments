
/**
 *  Illustrate the prefix/postfix unary increment operator
 *
 * @author emaph
 */
class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i);	// "4"
        ++i;
        System.out.println(i);	// "5"
        System.out.println(++i);	// "6"
        System.out.println(i++);	// "6"
        System.out.println(i);	// "7"
    }
}
