
import java.io.IOException;


/**
 * Find current project directory
 *
 * @author emaph
 */
public class CurrentDirectory {

    public static void main(String[] args) throws IOException {
        String currentPath = new java.io.File(".").getCanonicalPath();
        System.out.println("Current dir: " + currentPath);

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System: " + currentDir);
    }
}
