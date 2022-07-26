package Assigment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Game game = new Game();
		deck.addCard(new Card(Card.ACE, Card.SPADES));
		deck.addCard(new Card(Card.TWO, Card.SPADES));
		deck.addCard(new Card(Card.THREE, Card.SPADES));
		deck.addCard(new Card(Card.FOUR, Card.SPADES));
		deck.addCard(new Card(Card.FIVE, Card.SPADES));
		deck.addCard(new Card(Card.SIX, Card.SPADES));
		deck.addCard(new Card(Card.SEVEN, Card.SPADES));
		deck.addCard(new Card(Card.EIGHT, Card.SPADES));
		deck.addCard(new Card(Card.NINE, Card.SPADES));
		deck.addCard(new Card(Card.TEN, Card.SPADES));
		deck.addCard(new Card(Card.JACK, Card.SPADES));
		deck.addCard(new Card(Card.QUEEN, Card.SPADES));
		deck.addCard(new Card(Card.KING, Card.SPADES));

		deck.addCard(new Card(Card.ACE, Card.HEARTS));
		deck.addCard(new Card(Card.TWO, Card.HEARTS));
		deck.addCard(new Card(Card.THREE, Card.HEARTS));
		deck.addCard(new Card(Card.FOUR, Card.HEARTS));
		deck.addCard(new Card(Card.FIVE, Card.HEARTS));
		deck.addCard(new Card(Card.SIX, Card.HEARTS));
		deck.addCard(new Card(Card.SEVEN, Card.HEARTS));
		deck.addCard(new Card(Card.EIGHT, Card.HEARTS));
		deck.addCard(new Card(Card.NINE, Card.HEARTS));
		deck.addCard(new Card(Card.TEN, Card.HEARTS));
		deck.addCard(new Card(Card.JACK, Card.HEARTS));
		deck.addCard(new Card(Card.QUEEN, Card.HEARTS));
		deck.addCard(new Card(Card.KING, Card.HEARTS));
		
		deck.addCard(new Card(Card.ACE, Card.DIAMONDS));
		deck.addCard(new Card(Card.TWO, Card.DIAMONDS));
		deck.addCard(new Card(Card.THREE, Card.DIAMONDS));
		deck.addCard(new Card(Card.FOUR, Card.DIAMONDS));
		deck.addCard(new Card(Card.FIVE, Card.DIAMONDS));
		deck.addCard(new Card(Card.SIX, Card.DIAMONDS));
		deck.addCard(new Card(Card.SEVEN, Card.DIAMONDS));
		deck.addCard(new Card(Card.EIGHT, Card.DIAMONDS));
		deck.addCard(new Card(Card.NINE, Card.DIAMONDS));
		deck.addCard(new Card(Card.TEN, Card.DIAMONDS));
		deck.addCard(new Card(Card.JACK, Card.DIAMONDS));
		deck.addCard(new Card(Card.QUEEN, Card.DIAMONDS));
		deck.addCard(new Card(Card.KING, Card.DIAMONDS));
		
		deck.addCard(new Card(Card.ACE, Card.CLUBS));
		deck.addCard(new Card(Card.TWO, Card.CLUBS));
		deck.addCard(new Card(Card.THREE, Card.CLUBS));
		deck.addCard(new Card(Card.FOUR, Card.CLUBS));
		deck.addCard(new Card(Card.FIVE, Card.CLUBS));
		deck.addCard(new Card(Card.SIX, Card.CLUBS));
		deck.addCard(new Card(Card.SEVEN, Card.CLUBS));
		deck.addCard(new Card(Card.EIGHT, Card.CLUBS));
		deck.addCard(new Card(Card.NINE, Card.CLUBS));
		deck.addCard(new Card(Card.TEN, Card.CLUBS));
		deck.addCard(new Card(Card.JACK, Card.CLUBS));
		deck.addCard(new Card(Card.QUEEN, Card.CLUBS));
		deck.addCard(new Card(Card.KING, Card.CLUBS));
		
		
		
		Card player1card = new Card(Card.KING, Card.SPADES);
		Card player2card = new Card(Card.KING, Card.SPADES);
		Card player3card = new Card(Card.SEVEN, Card.CLUBS);
		
		ArrayList<Player> playerslist = new ArrayList<>();
		playerslist.add(new Player("sivan", 100, player1card, 1));
		playerslist.add(new Player("Ram", 100, player2card, 0));
		playerslist.add(new Player("ravi", 100, player3card, 1));
		

		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Name of the player: ");
//		String palyer1name =sc.next(); sc.nextLine();
//		System.out.print("Bet money: ");
//		int palyer1coin = sc.nextInt();
//	
//		deck.bet(palyer1coin,playerslist,palyer1name);
//		System.out.print("Name of the Player: ");
//		String palyer2name = sc.next();sc.nextLine();
//		System.out.print("Bet money: ");
//		int palyer2coin = sc.nextInt();
//		
//		deck.bet(palyer2coin,playerslist,palyer2name);
//		System.out.print("Name of the Player: ");
//		String palyer3name = sc.next();sc.nextLine();
//		System.out.print("Bet money: ");
//		int palyer3coin = sc.nextInt();
//		
//		deck.bet(palyer3coin,playerslist,palyer3name);
//		int totalbetmoney = palyer1coin + palyer2coin +  palyer3coin;
		
		deck.shuffle();	
		
		String findwinner = game.findwinner(deck,playerslist,10);
		System.out.println(findwinner);
	
//		System.out.println(	deck.deal(playerslist,totalbetmoney));
		
	}
	
	public String findwinner(Deck deck,ArrayList<Player> playerslist,int totalbetmoney) {
		
	String winnerName = deck.deal(playerslist,totalbetmoney);
	return winnerName;
	
	}

}
