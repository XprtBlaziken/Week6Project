package Week06Project;

import java.util.ArrayList;
import java.util.List;


class Player{
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name;
public void describePlayer(Player player) {
	for(Card c:hand) {
		c.describe();
	}
}
	public Card flip() {
		Card card = hand.remove(0);
		return card;
	}
	public void increment(){
		this.score++;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

