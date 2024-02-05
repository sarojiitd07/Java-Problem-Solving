package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		List<Integer> list = List.of(arr);
		System.out.println(arraySum(list));

	}
	public static int arraySum(List<Integer> arr) {
		
//		List<Integer> list = new ArrayList<>(arr);
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		return sum;
		int sum = arr.stream().mapToInt(Integer::intValue).sum();
//		return arr.stream().reduce(0,(n1,n2)-> n1+n2);
		return sum;
	}

}
