package com.in28minutes.basics;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String[] str = {"abc","bcd","def","fghf"};
		System.out.println(maxLengthOfString(4,str));
//		System.out.println(Math.abs(-1));
    }
    
    public static int maxLengthOfString(int N, String [] words){
    	int result = 0;
    	Set<Character> set = new HashSet<>();
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<words[i].length();j++) {
    			set.add(words[i].charAt(j));
    		}
    	}
    	System.out.println(set);
    	result = set.size();
        return result;
    }

}
