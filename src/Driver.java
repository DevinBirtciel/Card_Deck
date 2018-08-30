
public class Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck.toString());
		deck.shuffle();
		System.out.println(deck.toString());
		deck.cut(5);
		System.out.println(deck.toString());
		Card card = deck.turnOver();
		System.out.println(card.toString());
		int position = deck.search(new Card(Suit.HEART, Rank.TEN));
		System.out.println("position = " + position);
		card = deck.deal();
		System.out.println(card.toString());
	}

}
