package com.in28minutes.basics;

public class StringComperission {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		System.out.println(s1==s2);
//		s1 = "def";
		String k = null;
		System.out.println(s1.equals(s2));
		if(s1.contains("a")) {
			k=s1.replace("a", "d");
		}
		System.out.println(k);
		System.out.println(k==s2);
	}

}
