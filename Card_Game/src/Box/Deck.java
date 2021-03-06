package Box;
import java.util.ArrayList;
import java.util.Collections;



public class Deck{
	
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Deck() {
		
		for(int i = 0; i < 4; i++) {
		
			String suit = null;
			
			switch(i){
				case 0:
					suit = "Hearts";
				break;
					
				case 1:
					suit = "Clubs";
				break;
				
				case 2:
					suit = "Spades";
				break;
				
				case 3:
					suit = "Diamonds";
				break;
			}
			
			for(int j = 2; j <= 10; j++) {
				
				Card c = new Card(suit, suit + " of " + j, j);
				cards.add(c);
				
			}
			
			Card jack = new Card(suit, suit + " jack " + "of " + 10 , 10);
			Card queen = new Card(suit, suit + " queen " + "of " + 10 , 10);
			Card king = new Card(suit, suit + " king " + "of " + 10 , 10);
			Card ace = new Card(suit, suit + " ace " + "of " + 11 , 11);
			
			cards.add(jack);
			cards.add(queen);
			cards.add(king);
			cards.add(ace);
			
			
		}
		
		Collections.shuffle(cards);
	}

	public Card getNextCard() {
		
		int next = 0;
		Card nextCard = cards.remove(next);
		//System.out.println("Your card is: " + cards.remove(next));
		return nextCard;
		
	}
	
	public ArrayList<Card> getCards(){
		return cards;	
	}
	
}
