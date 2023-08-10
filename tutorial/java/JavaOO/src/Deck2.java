
/**
 * Represents a full deck of cards
 * @author emaph
 */
public class Deck2 {

    public final static int NUMSUITS = 4;
    public final static int NUMRANKS = 13;
    public final static int NUMCARDS = NUMSUITS * NUMRANKS;

    private final Card2[][] cards = new Card2[NUMSUITS][NUMRANKS];

    public Deck2() {
        for (int suit = Card2.DIAMONDS; suit <= Card2.SPADES; suit++) {
            for (int rank = Card2.ACE; rank <= Card2.KING; rank++) {
                cards[suit-1][rank-1] = new Card2(rank, suit);
            }
        }
    }

    public Card2 getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}