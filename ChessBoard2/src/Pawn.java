
/**
 * Represent a Pawn on a Chessboard
 * @author emaph
 */
public class Pawn {
    public static String WHITE = "White";
    public static String BLACK = "Black";
    public static String BLANK = "Blank";

    private String color;
    
    Pawn(String color) {
        this.color = color;
    }
    
    Pawn() {
        this.color = BLANK;
    }

    String getColor() {
        return color;
    }
}
