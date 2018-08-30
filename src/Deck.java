import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO Error handling and edge cases
// TODO these method names are starting to make me think I should have used a stack
public class Deck {
	private List<Card> cards;
	
	public Deck(List<Card> cards) {
		this.setCards(cards);
	}
	
	public Deck() {
		cards = Deck.newOrder();
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
	
	public Card deal() {
		Card card = cards.get(0);
		cards.remove(0);
		return card;
	}
	
	public Card turnOver() {
		return cards.get(0);
	}
	
	// It's a small list so doing iterative search for now.
	// Binary search would still be more efficient.
	public int search(Card card) {
		for(int i = 0; i < cards.size(); i++) {
			if(card.equals(cards.get(i))) {
				return i;
			}
		}
		return -1; // error response meaning card not in deck
	}
	
	// did you really mean to flip A-K A-K then K-A K-A?
	// makes the sorting more tricky for real if I were to for loop this based on a comparison
	public static List<Card> newOrder(){
		List<Card> cardList = new ArrayList<Card>();
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				cardList.add(new Card(suit, rank));
			}
		}
		cardList.sort(new CardComparator());
		return cardList;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		String deckString = "";
		for(int i = 0; i < cards.size(); i++) {
			deckString += " Card " + i + ": " + cards.get(i).toString();
		}
		return deckString;
	}
	
	
	
}
