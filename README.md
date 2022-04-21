# Card-Game
The card game project was a game where you need to guess if the nextcard is higher or lower than the  current card. The value of your cards are your points. You can stop the game if you think your points will go 21 or above. If your value is 21 or above you lose. The player with the most points win.

#### Making the 52 cards
I made a method for the deck wich made for every suit of cards the basic 11 cards. After that I made for the Jack, Queen, King and Ace a new card with the current suit. That means those cards will be made for every suit. After that I added it to my array. At the end I have all 52 cards in my Array.

```Java
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
   ```
