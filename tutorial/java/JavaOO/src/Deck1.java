
/**
 * Represents a full deck of cards
 * @author emaph
 */
public class Deck1 {

    public final static int NUMSUITS = 4;
    public final static int NUMRANKS = 13;
    public final static int NUMCARDS = NUMSUITS * NUMRANKS;

    private final Card1[][] cards = new Card1[NUMSUITS][NUMRANKS];

    public Deck1() {
        for (int suit = Card1.DIAMONDS; suit <= Card1.SPADES; suit++) {
            for (int rank = Card1.ACE; rank <= Card1.KING; rank++) {
                cards[suit-1][rank-1] = new Card1(rank, suit);
            }
        }
    }

    public Card1 getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}