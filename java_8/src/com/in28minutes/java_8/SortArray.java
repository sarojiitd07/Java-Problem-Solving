package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		List<Integer> arr1 = List.of(12,4,6,9,2,6,15);
		List<Integer> arr2 = List.of(14,5,10,17,12,16,25);
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.addAll(arr2);
		arraylist.addAll(arr1);
		arraylist.stream().sorted().forEach(System.out::print);;
//		Collections.sort(arraylist);
		
		List<Integer> finalList =  arraylist.stream().sorted().collect(Collectors.toList());
		
		System.out.println(finalList);

	}

}
