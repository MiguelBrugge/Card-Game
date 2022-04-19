package Box;

public class Card {
	
	private String suit;
	private String name;
	private int value;
	
	public Card(String suit, String name, int value) {
		this.suit = suit;
		this.name = name;
		this.value = value;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean isHigherOrEqual(Card c) {
		if(value >= c.value || value == c.value) {
			return true;
		}
		return false;
	}
	
}
