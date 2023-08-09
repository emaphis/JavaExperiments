
package annotations;

/**
 *
 * @author emaph
 */
@JavaFileInfo
public class DemoClass {

    @JavaFileInfo(author = "Lokesh", version = "1.0")
    public String getString() {
        return "string";
    }
}
