
/**
 * Represents a full deck of cards
 * @author emaph
 */
public class Deck3 {

    public final static int NUMCARDS = 4 * 13;

    private final Card3[] cards = new Card3[NUMCARDS];

    public Deck3() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card3(rank, suit);
            }
        }
    }

    public Card3 getCard(int i) {
        return cards[i];
    }
}