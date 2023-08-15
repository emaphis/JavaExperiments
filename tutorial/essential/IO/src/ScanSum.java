
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


/**
 *
 * @author emaph
 */
public class ScanSum {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        double sum = 0.0;

        try {
            s = new Scanner(new BufferedReader(new FileReader("usenumbers.txt")));
            s.useLocale(Locale.US);

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } finally {
            if (s != null)
                s.close();
        }

        System.out.println("sum = " + sum);
    }
}
