
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * All character stream classes are descended from Reader and Writer. As with
 * byte streams, there are character stream classes that specialize in file
 * I/O: FileReader and FileWriter. The CopyCharacters example illustrates these
 * classes.
 * @author emaph
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
