
/**
 * when mixing legacy code with generic code, you may encounter warning messages
 * @author emaph
 */
public class WarningDemo {
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
    }

    // old API
    static Box createBox() {
        return new Box();
    }
}
