package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum Suit{
	spade,heart,diamond,club
}

enum Rank{
	two,three,four,five,six,seven,eight,nine,ten,jack,queen,king,ace
}

class CardDesign{
	
	private Suit suit;
	private Rank rank;
	
	public CardDesign(Suit suit, Rank rank) {
		this.suit =suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}



	public void setSuit(Suit suit) {
		this.suit = suit;
	}



	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Suit =" + suit + ", Rank =" + rank;
	}
	
}

class CardDesignComparator implements Comparator<CardDesign>{
	@Override
	public int compare(CardDesign o1, CardDesign o2) {
		List<Rank> listOfcards = List.of(Rank.two,Rank.three,Rank.four,Rank.five,Rank.six,Rank.seven,
				Rank.eight,Rank.nine,Rank.ten,Rank.jack,Rank.queen,Rank.king,Rank.ace);
		int indexOfCard1 = listOfcards.indexOf(o1.getRank());
		int indexOfCard2 = listOfcards.indexOf(o2.getRank());
		if(indexOfCard1>indexOfCard2) {
			return 1;
		}else if(indexOfCard1==indexOfCard2) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public CardDesign cardsCompare(CardDesign c1, CardDesign c2) {
		List<Rank> listOfcards = List.of(Rank.two,Rank.three,Rank.four,Rank.five,Rank.six,Rank.seven,
				Rank.eight,Rank.nine,Rank.ten,Rank.jack,Rank.queen,Rank.king,Rank.ace);
		int indexOfCard1 = listOfcards.indexOf(c1.getRank());
		int indexOfCard2 = listOfcards.indexOf(c2.getRank());
		
		if(indexOfCard1>indexOfCard2) {
			return c1;
		}else if(indexOfCard1<indexOfCard2) {
			return c2;
		}else {
			return c1;
		}
	}
}

	
public class CardDesignRunner{
	public static void main(String[] args) {
		List<CardDesign> list = new ArrayList<>();
		Rank[] r = Rank.values();
		Suit[] s = Suit.values();
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<r.length;j++) {
				list.add(new CardDesign(s[i],r[j]));
			}
		}

		Collections.sort(list,new CardDesignComparator());
		
		CardDesignComparator cardDesignComparator  = new CardDesignComparator();
		System.out.println(cardDesignComparator.cardsCompare(new CardDesign(Suit.spade, Rank.two),
				new CardDesign(Suit.diamond, Rank.king)));

		
		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getSuit() + " "+ list.get(i).getRank());
			System.out.println(list.get(i));
		}
//		for(CardDesign cardDesign : list) {
//			System.out.println(cardDesign);
//		}
		
//		list.stream().forEach(e->System.out.println(e));
	}

}
