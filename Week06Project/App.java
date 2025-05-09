package Week06Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App{
	private static Map<String, List<Card>> createGame(int numOfPlayers) {
		Map<String, List<Card>> finalGameMap = new HashMap<>();
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Deck has " + deck.getCards().size() + " cards!");
		for (int i = 1; i <= numOfPlayers; i++) {
			List<Card> playerList = new ArrayList<>();
			String playerName = "Player " + i;
			finalGameMap.put(playerName, playerList);
		}
		for (int i = 0; i < 52/numOfPlayers; i++) {
			for (int j = 1; j <= numOfPlayers; j++) {
				String playerName = "Player " + j;
				List<Card> playerList = finalGameMap.get(playerName);
				playerList.add(deck.draw());
				finalGameMap.replace(playerName, playerList);			
			}
		}
		if (52 % numOfPlayers != 0) {
			System.out.print("With " + numOfPlayers + " players -- ");
			System.out.println("Cards left in deck: " + 52%numOfPlayers); 
		} else {
			System.out.println("All cards have been dealt");
		}
}
 class Card{
	 Card tempCard = new Card("Two", "Hearts", 2);
	 tempCard.describe();

}

class Deck{
	deck.shuffle();
	deck.describe();
}

class Players{
	int numOfPlayers = 2;
	for (int i = 1; i <= numOfPlayers; i++) {
		String playerName = "Player " + i;
		System.out.println(playerName + "\n--------");
		List<Card> playerList = gameBoard.get(playerName);
		for (Card handCard : playerList) {
			handCard.describe();
			}	
		}
	}
}