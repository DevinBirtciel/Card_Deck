
public enum Suit {
	HEART(1), CLUB(2), DIAMOND(3), SPADE(4);
	
	private final int value;
	
	Suit(final int newValue) {
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	
}
