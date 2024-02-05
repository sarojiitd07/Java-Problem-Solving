package com.in28minutes.basics;

public class IsPalindrome {

	public static void main(String[] args) {
		String stringSentence = "Don’t nod";
		String str = stringSentence.toLowerCase();
		System.out.println(isPalindrome(str));

	}
	
	public static Boolean isPalindrome(String str) {
		String temp = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				temp +=str.charAt(i);
			}
		}
		
		String reverse ="";
		for(int i=temp.length()-1;i>=0;i--) {
			reverse +=temp.charAt(i);
		}
		
		if(reverse.equals(temp)) {
			return true;
		}else {
			return false;
		}
	}

}
