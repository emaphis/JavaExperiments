
package threads.examples.ch02.example1;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(n + "! is ");
        int fact = 1;
        while (n > 1)
            fact *= n--;
        System.out.println(fact);
    }
}
