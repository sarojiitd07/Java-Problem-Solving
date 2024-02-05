package com.in28minutes.basics;

public class IsVowelPresent {

	public static void main(String[] args) {
		String str = "bbajhkjdjh";
		Boolean flag = false; 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||
					str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				flag = true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Vowel is present");
		}
		else {
			System.out.println("Vowel is not present");
		}
		
		System.out.println(str.matches(".*[aeiouAEIOU].*"));
		
//		stream = str.chars().anyMatch("aeiouAEIOU").
		System.out.println(str.chars().mapToObj(e-> (char)e).
				anyMatch(e-> (e=='a'||e=='e'||e=='i'||e=='o'||e=='u'||e=='A'||e=='E'||
				e=='I' || e=='O' || e=='U')));
		

	}

}
