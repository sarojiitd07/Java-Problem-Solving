package com.in28minutes.basics;
import java.util.HashMap;
import java.util.Map;

public class SortedHashMap {

	public static void main(String[] args) {
		System.out.println(sortedHashMap());

	}
	
	public static Map<Character, Integer> sortedHashMap(){
		Map<Character,Integer> hashMap = new HashMap<>();
		String str = "abcdabcaba";
		for(int i=0;i<str.length();i++) {		
			if(hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			}else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		return hashMap;
	}

}
