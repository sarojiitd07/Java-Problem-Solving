package com.in28minutes.java_8;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveStringinPair {

	public static void main(String[] args) {

			String str = "abbccba";
//			StringBuffer strb = new StringBuffer(str);
//			 
//			while(strb.length()>0) {
//				String strfix = strb.toString();
//
//				
//				for(int i=0;i<strb.length()-1;i++) {
//					if(strb.charAt(i)==strb.charAt(i+1)) {
//						strb.delete(i, i+1+1);
//					}
//				}
//				if(strfix.equals(strb.toString())) {
//					break;
//				}else {
//					strfix = strb.toString();
//				}
//			}
//			System.out.println(strb);
//			Set<Integer> set = new HashSet<>();
//			set.add(1);
			Stack<Character> stack = new Stack<>();
			for(int i=0;i<str.length();i++) {
				if(stack.size()==0) {
					stack.add(str.charAt(i));
				}else if(str.charAt(i)==stack.peek()) {
					stack.pop();
				}else {
					stack.add(str.charAt(i));
				}
			}
			for(int i=0;i<stack.size();i++) {
				System.out.print(stack.get(i));
			}
			
	    }

}
