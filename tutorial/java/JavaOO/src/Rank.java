
/**
 * Represents a Card Rank
 * @author emaph
 */
public enum Rank {
    DEUCE("Deuce"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");

    private String face;

    Rank(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }

}
