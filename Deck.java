package Assigment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Deck {

	private List<Card> cards;

	public Deck() {

//		this.cards = new ArrayList<>();
		this.cards = new LinkedList<>();

	}

	public Boolean addCard (Card card) {
		if (cards.indexOf(card) == -1 && card.isValid()) {
			cards.add(card);
			return true;
		}
		else {
			System.out.println("Card already present in hand");
			return false;
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
		
	}



//	public String deal(ArrayList<Player> playerslist,int totalbetmoney) {
//		
//		ListIterator<Card> it = cards.listIterator();
//		//		ListIterator<Player> palyer = playerslist.listIterator();
//		
//
////		Card pollFirst = ((LinkedList<Card>) cards).pollFirst();
////		System.out.println(pollFirst);
//		
//		
//		while (it.hasNext()) {
//			int index = it.nextIndex();
//			Card item = it.next();
//			ListIterator<Player> palyer = playerslist.listIterator();
//			while (palyer.hasNext()) {
//				int indexp = palyer.nextIndex();
//				Player itemp = palyer.next();
////				String itemc = item.toString(); 
//				String itemc = item.toString(); 
//				Card chosencard = itemp.getChosencard();
//
//
//				if(itemc.equals(chosencard.toString())) {
//					
//					if(index % 2 == 0 && itemp.getChoosenOrentation() == 0) {
//					
//						int addwinnings = Deck.addwinnings(totalbetmoney,itemp.getCoins());
//						itemp.setCoins(addwinnings);
//						return itemp.getName() + " win";
//					}else if(index % 2 == 1 && itemp.getChoosenOrentation() == 1) {
//						int addwinnings = Deck.addwinnings(totalbetmoney,itemp.getCoins());
//						itemp.setCoins(addwinnings);
//						return itemp.getName() + " win";
//
//					}
//				}
//			}
//
//
//
//		}
//		return "winner is host";
//
//
//	}
	
	
	public String deal(ArrayList<Player> playerslist,int totalbetmoney) {
		

		
        int count  = 0;
        while(count <= 51) {
		Card pollFirst = ((LinkedList<Card>) cards).pollFirst();

		
			ListIterator<Player> palyer = playerslist.listIterator();
			while (palyer.hasNext()) {
				Player itemp = palyer.next();
				String itemc = pollFirst.toString(); 
				Card chosencard = itemp.getChosencard();


				if(itemc.equals(chosencard.toString())) {

					
					if(count % 2 == 0 && itemp.getChoosenOrentation() == 0) {
						System.out.println(count);
					
						int addwinnings = Deck.addwinnings(totalbetmoney,itemp.getCoins());
						itemp.setCoins(addwinnings);
						return itemp.getName() + " win";
					}else if(count % 2 == 1 && itemp.getChoosenOrentation() == 1) {
						int addwinnings = Deck.addwinnings(totalbetmoney,itemp.getCoins());
						itemp.setCoins(addwinnings);
						return itemp.getName() + " win";

					}
					
				}
				
			}
			count++;
			}

		return "winner is host";


	}


	public void bet(int coin,ArrayList<Player> playerslist,String name) {
       boolean flag = true;

		for(Player  player: playerslist) {
			if(player.getName().equals(name)){
				while(flag) {
				if(player.getCoins() > coin) {
				int newbalance = player.getCoins() - coin;
				player.setCoins(newbalance);
				System.out.println(player.getName() +" "+ player.getCoins());
				flag = false;
				}else {
					System.out.println("Balance coin is: "+ player.getCoins());
					System.out.print("Bet money: ");
					Scanner scanner = new Scanner(System.in);
					coin = scanner.nextInt();
					
				}
				}
			}
		}

	}
	
	public static  int addwinnings(int totalbetmoney,int balancecoin) {
		
		int winningCoin  = totalbetmoney + balancecoin;
		return winningCoin;
		
	}


}



