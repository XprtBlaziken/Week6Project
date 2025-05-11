package Week06Project;



public class App{
	public static void main(String[] args) {
		
	
		Player p1 = new Player();
		Player p2 = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			p1.getHand().add(deck.draw());
			p2.getHand().add(deck.draw());
		}
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i+1));
			Card p1Draw = p1.flip();
			System.out.print("Player One card is: ");
			p1Draw.describe();
			Card p2Draw = p2.flip();
			System.out.print("Player Two card is: ");
			p2Draw.describe();
			if(p1Draw.getValue() > p2Draw.getValue()) {
				p1.increment();
				System.out.println("Player One wins this round");
			} else if(p1Draw.getValue() < p2Draw.getValue()) {
				p2.increment();
				System.out.println("Player Two wins this round");
			} else {
				System.out.println("Tie");
			}
			System.out.println("Player One Score: " + p1.getScore());
			System.out.println("Player Two Score: " + p2.getScore());
			System.out.println();
			}//end of gameplay
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Player One wins the War");
		} else if(p1.getScore() < p2.getScore()) {
			System.out.println("Player Two Wins the War");
		} else {
			System.out.println("Nobody Wins in War");
		}
		
	}//end of main		
}	// end of class	