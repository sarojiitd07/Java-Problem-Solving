package com.in28minutes.basics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
//		int n=6;
		for(int i=0;i<6;i++) {
			System.out.print(fibonacci(i)+" ");
		}
		System.out.println();
		
		System.out.println("Fibonacci Series using Java 8 Stream :- ");
//		 
//        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) // 1. Iterate fibonacci number
//        .limit(6) // 2. limit to 6 Integer numbers
//        .map(n -> n[0]) // get 0th index from Arrays of size-2
//        .forEach(fibNum -> System.out.print(fibNum + " ")); // 3. print to console
        
        Stream.iterate(new int[] {0,1},f -> new int[] {f[1],f[0]+f[1]})
        .limit(6).map(f->f[0]).forEach(e->System.out.print(e +" "));
      
	}
	
	public static int fibonacci(int n) {
//		int a=0;
//		int b=1;
//		int c=1;
//		for(int i=0;i<n;i++) {
//			System.out.print(a+" ");
//			a=b;
//			b=c;
//			c=a+b;
//		}
		
		if(n==1 ||n==0) {
			return n;
		}else if(n>1){
			return fibonacci(n-1) + fibonacci(n-2);
		}else {
			return -1;
		}
	}

}

