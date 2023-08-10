
/**
 * Represents Card3 Suits
 * @author emaph
 */
public enum Suit {
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String face;

    Suit(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }
}
