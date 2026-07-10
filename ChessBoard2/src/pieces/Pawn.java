package pieces;



/**
 *
 * @author emaph
 */
public class Pawn {
    private final String color;

    public static final String WHITE = "white";
    public static final String BLACK = "black";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = WHITE;
    }

    public String getColor() {
        return color;
    }

}
