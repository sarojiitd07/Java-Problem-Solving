package com.in28minutes.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayEqual {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5,6,9};
		Integer[] arr2 = {1,2,3,4,6,5,9,9};
		System.out.println(arrayEqual(arr1, arr2));

	}
	
	public static boolean arrayEqual(Integer[] arr1, Integer[] arr2) {
//		if(Arrays.equals(arr1,arr2)) {
//			return true;
//		}else {
//			return false;
//		}
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
		
		if(set1.equals(set2)){
			return true;
		}else {
			return false;
		}
//		if(set1.size()!=set2.size()) {
//			return false;
//		}
//		for(Integer a : set1) {
//			if(!set2.contains(a)) {
//				return false;
//			}
//			
//		}
//		return true;
	}

}
