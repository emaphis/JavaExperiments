
/**
 * A program to print out a Deck of Card.
 * @author emaph
 */
public class CardsDemo3 {
    public static void main(String[] args) {
        Deck3 deck = new Deck3();
        for (int i = 0; i < 52; i++) {
            Card3 card = deck.getCard(i);
            System.out.println(card);
        }
    }
}
