package com.in28minutes.basics;

public class Pyramid {

	public static void main(String[] args) {
		String str = "abcdefghijklm";
		char a = 'a';
		pyramid(a);

	}
	
	public static void pyramid(char a) {
//		for(int i=0;i<str.length();i+=2) {
//			for(int j=0; j<str.length();j++){
//				if(j>=(str.length()-i)/2 && j<=(str.length()+i)/2) {
//					System.out.print(str.charAt(j));
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<50;i+=2) {
			for(int j=0;j<50;j++) {
				if(j>=(50-i)/2 && j<=(50+i)/2) {
					System.out.print(a);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
