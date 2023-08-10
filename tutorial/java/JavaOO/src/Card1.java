// Exercise

/**
 * Represents a playing Card.
 *
 * @author emaph
 */
public class Card1 {

    // Suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    // Ranks
    public final static int ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    private final int rank;
    private final int suit;

    public Card1(int rank, int suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public static boolean isValidRank(int rank) {
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(int suit) {
        return DIAMONDS <= suit && suit <= SPADES;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static String rankToString(int rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return null;
        }
    }

    public static String suitToString(int suit) {
        switch (suit) {
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    private static void testCard() {
        assert "Ace".equals(rankToString(ACE));
        assert "Deuce".equals(rankToString(DEUCE));
        assert "Three".equals(rankToString(THREE));
        assert "Four".equals(rankToString(FOUR));
        assert "Five".equals(rankToString(FIVE));
        assert "Six".equals(rankToString(SIX));
        assert "Seven".equals(rankToString(SEVEN));
        assert "Eight".equals(rankToString(EIGHT));
        assert "Nine".equals(rankToString(NINE));
        assert "Ten".equals(rankToString(TEN));
        assert "Jack".equals(rankToString(JACK));
        assert "Queen".equals(rankToString(QUEEN));
        assert "King".equals(rankToString(KING));

        assert "Diamonds".equals(suitToString(DIAMONDS));
        assert "Clubs".equals(suitToString(CLUBS));
        assert "Hearts".equals(suitToString(HEARTS));
        assert "Spades".equals(suitToString(SPADES));
    }

    public static void main(String[] args) {
        testCard();
    }
}
