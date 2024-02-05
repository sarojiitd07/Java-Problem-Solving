package com.in28minutes.basics;

import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {
		int fact=IntStream.range(1, 6).reduce(1, (e1,e2)-> e1*e2);
		System.out.println(fact);
		System.out.println(factorial(5));

	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}

}
