
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Converting a Path
 * @author emaph
 */
public class FileTest {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("usage: FileTest file");
            System.exit(-1);
        }

        // Converts the inut string to a Path object.
        Path inputPath = Paths.get(args[0]);

        // Convers the input Path to an absolute Path.
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("Full Path = " + fullPath);
    }
}
