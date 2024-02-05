package com.in28minutes.basics;

import java.util.List;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		List<String> list = List.of(" agsj "," hsgjs ","   hghhag   ","nkjh kd k d h g d j h s j hg d j h ");
		for(int i=0;i<list.size();i++) {
		System.out.println(removeSpace(list.get(i)));
		}
	}
	public static StringBuilder removeSpace(String str) {
		StringBuilder string = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				string.append(str.charAt(i));
				
			}
		}
//		for(int i=0;i<str.length();i++) {
//			if(str.matches(".*[' '].*")) {
//				string.append(str.charAt(i)); checks all at once
//			}
//		}
//		System.out.println(str);
//		str = str.strip();
		
		return string;
		
	}
	
}
