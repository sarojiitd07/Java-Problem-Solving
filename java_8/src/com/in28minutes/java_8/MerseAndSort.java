package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MerseAndSort {

	public static void main(String[] args) {
		List<Integer> arr1 = List.of(12,4,6,9,2,6,15);
		List<Integer> arr2 = List.of(14,5,10,17,12,16,25);
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.addAll(arr2);
		arraylist.addAll(arr2);
		arraylist.stream().sorted().collect(Collectors.toList());
//		Collections.sort(arraylist);
		
		System.out.println(arraylist);
		Double str = new Double(99.80);
//		boolean bool=str.isDigit();
		
		boolean b1=Character.isDigit(123);
		System.out.println(b1);
		
		System.out.println(str.getClass().getSimpleName());

//		"this man has 10 mangoes and 7.5 height"
	}

}
