
/**
 * Illustrates the use of lastIndexOf() and substring() to isolate different
 * parts of a file name.
 * @author emaph
 */
public class Filename {
    private final String fullPath;
    private final char pathSeparator;
    private final char extensionSeparator;

    public Filename(String path, char seo, char ext) {
        this.fullPath = path;
        this.pathSeparator = seo;
        this.extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // gets filename without extenson
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}
