package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class FactorialRunner {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,23,45,65,76);
		System.out.println(reverse(list));

	}
	
	public static List<Integer> reverse(List<Integer> n) {
		LinkedList<Integer> linkList = new LinkedList<>(n);
		ArrayList<Integer> arrayList = new ArrayList<>(n); 
		int temp = 0;
		for(int i=0; i<linkList.size()/2;i++) {
			temp = linkList.get(i);
			linkList.set(i, linkList.get(linkList.size()-i-1));
			linkList.set(linkList.size()-i-1, temp);
			arrayList.set(i, n.get(n.size()-1-i));
			arrayList.set(n.size()-1-i, temp);
			
			
		}
		return arrayList;
	}

}
