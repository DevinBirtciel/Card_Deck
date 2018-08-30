import java.util.Comparator;

public class CardComparator implements Comparator<Card>{

	@Override
	public int compare(Card card1, Card card2) {
		Suit card1Suit = card1.getSuit();
		Suit card2Suit = card2.getSuit();
		if(!card1Suit.equals(card2Suit)) {
			return card1Suit.getValue() - card2Suit.getValue();
		} else {
			
		}
		return 0;
	}

}
