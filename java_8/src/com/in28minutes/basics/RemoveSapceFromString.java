package com.in28minutes.basics;

import java.util.stream.IntStream;

public class RemoveSapceFromString {

	public static void main(String[] args) {
		String str ="     jshh jha  ambsakjskj   abjhhs  ";
		str.chars().mapToObj(e-> (char)e).filter(e-> e!=' ').
		forEach(e->System.out.print(e));
		System.out.println();
		System.out.println(str.strip().length());
		System.out.println(str.length());

	}

//	private static void removedSpaceString(String str) {
////		String removedSpace ="";
////		for(int i=0;i<str.length();i++){
////			if(str.charAt(i)==' ') {
////				continue;
////			}else {
////				removedSpace += str.charAt(i);
////			}
////		}
////		return removedSpace;
//		
//		return str.chars().mapToObj(e-> (char)e).forEach(e->System.out.print(e));
//		
//	}

}
