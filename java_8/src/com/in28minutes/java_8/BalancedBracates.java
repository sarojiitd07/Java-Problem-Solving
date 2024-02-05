package com.in28minutes.java_8;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracates {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        while(scan.hasNext()){
	            String str = scan.nextLine();
	            Stack<Character> stack = new Stack<>();
	            boolean flag = true;
	                for(int i=0;i<str.length();i++){
	                	if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
	                		stack.add(str.charAt(i));
	                	}else if(stack.size()!=0) {
	                		if(str.charAt(i)=='}' & stack.peek()=='{'){
		                		stack.pop();
	                		}else if(str.charAt(i)==')' & stack.peek()=='('){
	    	                	stack.pop();
	                		}else if(str.charAt(i)==']' & stack.peek()=='[') {
	                			stack.pop();
	                		}else {
	                			flag = false;
		                		break;
	                		}
	     
	                	}else{
	                		flag = false;
	                		break;
	                	}
                    
	                }	
	            
	            if(flag==true & stack.size()==0){
	                System.out.println("true");
	            }else{
	                System.out.println("false");
	            }
	            
	        }
	    }
}
