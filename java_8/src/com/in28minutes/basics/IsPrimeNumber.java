package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n= 16;
		Boolean flag =true;
		for(int i=2;i<n/2+1;i++) {
			if(n%i==0) {
				flag =false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
//		Integer[] arr = {1,2,3,4,5,6,7,787,9,10};
//		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		Boolean bool = !IntStream.range(2, n/2).anyMatch(i->n%i==0);
		System.out.println(bool);
	}

}
