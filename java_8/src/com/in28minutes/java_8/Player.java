package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Player {
	 public String name;
	 public int inning1st;
	 public int inning2nd;
	 Player(String name, int inning1st, int inning2nd){
	     this.name=name;
	     this.inning1st=inning1st;
	     this.inning2nd=inning2nd;
	 }
	 
	 Player(String name, int inning1st){
	     this.name=name;
	     this.inning1st=inning1st;
	 }
	 
	 public String getname() {
		 return name;
	 }
	 
	 public int getinning1st() {
		 return inning1st;
	 }
	 
	 public int getinning2nd() {
		 return inning2nd;
	 }
	 
	 public int getTotalScore() {
		 return inning1st+inning2nd;
	 }
//	 	@Override
//		public int compare(Player p1, Player p2) {
//			
//			     if(p1.inning1st + p1.inning2nd> p2.inning1st + p2.inning2nd){
//			         return 1;
//			     }else if(p1.inning1st + p1.inning2nd== p2.inning1st + p2.inning2nd){
//			         return 0;
//			     }else{
//			         return -1;
//			     }
//			 }
	 
	 public static void main(String[] args) {
	     List<Player> list = new ArrayList<>();
	     list.add(new Player("saroj",10,15));
	     list.add(new Player("Bhim",100,14));
	     list.add(new Player("sujeet",9));
	     list.add(new Player("kamal",9,7));
	     list.add(new Player("pankaj",10,15));
	     list.add(new Player("pankaj",100));
//	     Collections.sort(list,new Player("",1,4));
//	     for(int i=0;i<list.size();i++){
//	         System.out.println( list.get(i).inning1st + list.get(i).inning2nd + " " + list.get(i).name);
//	     }
	     List<Player> collect = list.stream().sorted(Comparator.comparing(Player::getname))
	    		 .sorted(Comparator.comparingInt(Player::getTotalScore))
	    		 .collect(Collectors.toList());
	     for(int i=0;i<list.size();i++) {
	    	 System.out.println(collect.get(i).inning1st + collect.get(i).inning2nd + " " + collect.get(i).name);
	     }
	     
	    List<String> collect2 = list.stream().map(e->e.getname()).collect(Collectors.toList());
	    System.out.println(collect2);
	 }
	
}









