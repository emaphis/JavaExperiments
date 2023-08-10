// Exercise

/**
 * Represents a playing Card.
 *
 * @author emaph
 */
public class Card3 {

    private final Rank rank;
    private final Suit suit;

    public Card3(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card3) {
            if (((Card3)obj).getRank() == this.rank &&
                ((Card3)obj).getSuit() == this.suit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return ((suit.hashCode() - 1) * 13) + rank.hashCode();
    }

    @Override
    public String toString() {
        return rank.getFace() + " of " + suit.getFace();
    }

    private static void testCard() {
        System.out.println("Card 1 = " + new Card3(Rank.ACE, Suit.DIAMONDS));
        System.out.println("Card 2 = " + new Card3(Rank.KING, Suit.SPADES));
    }

    public static void main(String[] args) {
        testCard();
    }
}
