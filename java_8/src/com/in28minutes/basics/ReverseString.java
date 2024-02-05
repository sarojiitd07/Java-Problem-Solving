package com.in28minutes.basics;

import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		String str = "saroj";
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i); 
		}
		System.out.println(reverse);
		
		StringBuffer strbuff = new StringBuffer(str);
		strbuff.reverse();
		
		System.out.println(strbuff);
		
		IntStream intStream = strbuff.chars();
		intStream.mapToObj(e -> (char)e).
		forEach(e-> System.out.print(e));
	}

}
