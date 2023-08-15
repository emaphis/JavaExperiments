
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Explore FileInputStream and FileOutputStream by examining an example program
 * named CopyBytes, which uses byte streams to copy xanadu.txt, one byte at a time.
 * @author emaph
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
