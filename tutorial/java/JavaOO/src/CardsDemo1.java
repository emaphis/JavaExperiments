
/**
 * A program to print out a Deck of Card.
 * @author emaph
 */
public class CardsDemo1 {
    public static void main(String[] args) {
        Deck1 deck = new Deck1();
        for (int suit = Card1.DIAMONDS; suit <= Card1.SPADES; suit++) {
            for (int rank = Card1.ACE; rank <= Card1.KING; rank++) {
                Card1 card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    Card1.rankToString(card.getRank()),
                    Card1.suitToString(card.getSuit()));
            }
        }
    }
}
