
/**
 * Constructs a Filename object and calls all of its methods
 * @author emaph
 */
public class FilenameDemo {
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";

        Filename myHomepage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomepage.extension());
        System.out.println("Filename = " + myHomepage.filename());
        System.out.println("Path = " + myHomepage.path());
    }
}
