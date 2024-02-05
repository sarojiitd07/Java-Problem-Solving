package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SmallestWindow {
	public static void main(String[] args) {
		String s = "baaabaaabaaaaabbc";
		String x = "aab";
		System.out.println(smallestWindow(s, x));
	}
		
		public static String smallestWindow(String s, String x) {
		Map<Character, Long> m = x.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		int min = Integer.MIN_VALUE;
		int minLength = Integer.MAX_VALUE;
		String finalString ="";
		for(int i=0;i<s.length();i++) {
			List<Character> set = new ArrayList<>();
			if(m.containsKey(s.charAt(i))) {
				for(int j=i;j<s.length();j++) {
					set.add(s.charAt(j));
					Map<Character, Long> sub = set.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
					boolean flag = true;
					for(Map.Entry<Character, Long> entry : m.entrySet()){
						if(!sub.containsKey(entry.getKey()) || entry.getValue() > sub.get(entry.getKey())) {
							flag = false;
							break;
						}
					}
					if(flag==true) {
						String subString = "";
						for(int k=0;k<set.size();k++) {
							subString +=set.get(k);
						}
						min = subString.length();
						if(min<minLength) {
							minLength = min;
							finalString = subString;
						}
						break;
					}
				}
			}
			set.clear();
			if(x.length()==finalString.length()) {
				break;
			}
		}
		return finalString;
	}
}



