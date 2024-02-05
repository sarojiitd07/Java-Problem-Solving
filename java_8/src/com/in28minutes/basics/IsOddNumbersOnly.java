package com.in28minutes.basics;

import java.util.List;

public class IsOddNumbersOnly {

	public static void main(String[] args) {
		List<Integer> arrayList = List.of(1,3,5,7,9,11,12);
		System.out.println(arrayList.stream().allMatch(e->e%2!=0));

	}

}
