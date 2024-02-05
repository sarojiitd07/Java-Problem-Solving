package com.in28minutes.java_8.p;

import java.util.HashSet;
import java.util.Set;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 5};
		System.out.println(pythagoreanTriplets(arr));
	}

	public static boolean pythagoreanTriplets(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]*arr[i]);
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(set.contains(arr[i]*arr[i]+arr[j]*arr[j])) {
					return true;
				}
			}
		}
		return false;
    }
}
