package Assigment3;

public class Player {
	
	private String name;
	private int coins;
	private Card chosencard;
	private int choosenOrentation;
	
	public Player(String name, int coins, Card chosencard, int choosenOrentation) {
		super();
		this.name = name;
		this.coins = coins;
		this.chosencard = chosencard;
		this.choosenOrentation = choosenOrentation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public Card getChosencard() {
		return chosencard;
	}

	public void setChosencard(Card chosencard) {
		this.chosencard = chosencard;
	}

	public int getChoosenOrentation() {
		return choosenOrentation;
	}

	public void setChoosenOrentation(int choosenOrentation) {
		this.choosenOrentation = choosenOrentation;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", coins=" + coins + ", chosencard=" + chosencard + ", choosenOrentation="
				+ choosenOrentation + "]";
	}
	
	
	
	

}
