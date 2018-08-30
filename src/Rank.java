
public enum Rank {
	ACE(0,14), ONE(1,1), TWO(2,2), THREE(3,3), 
	FOUR(4,4), FIVE(5,5), SIX(6,6), SEVEN(7,7), EIGHT(8,8), 
	NINE(9,9), TEN(10,10), JACK(11,11), QUEEN(12,12), KING(13,13);
	
	private final int value;
	private final int value2;
	
	Rank(final int newValue, final int newValue2) {
		value = newValue;
		value2 = newValue2;
	}
	
	public int getValue1() {
		return value;
	}
	
	public int getValue2() {
		return value2;
	}
}
