import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck(List<Card> cards) {
		this.setCards(cards);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void cut(int cutPoint) {
		// TODO test that ordering works
		// Probably a better way to do this
		// Not sure what to do with middle card based on description
		List<Card> topCut = cards.subList(0, cutPoint);
		cards.removeAll(topCut); // cards is now lowCut
		cards.addAll(topCut);
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
}
