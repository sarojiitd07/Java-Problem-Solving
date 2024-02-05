package com.in28minutes.java_8;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String str = "](()))";
		System.out.println(isBalanced(str));

	}
	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='('|| str.charAt(i)=='['|| str.charAt(i)=='{') {
				stack.add(str.charAt(i));
			}else if(stack.size()!=0) {
				if(str.charAt(i)==')' & stack.peek()=='(') {
					stack.pop();
				}else if(str.charAt(i)=='}' & stack.peek()=='{') {
					stack.pop();
				}else if(str.charAt(i)==']' & stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		if(stack.size()==0) {
			return true;
		}else {
			return false;
		}
	}

}
