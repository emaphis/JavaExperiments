
/**
 * Exercise 14.1 Write a program that displays the name of the thread that
 *          executes main.
 * @author emaph
 */
public class PrintMain {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name = " + name);
    }
}
