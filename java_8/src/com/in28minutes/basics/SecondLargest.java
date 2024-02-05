package com.in28minutes.basics;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,5,7,2,5,8};
		System.out.println(secondLargest(arr));

	}
	
	public static int secondLargest(int[] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0; j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//				
//			}
//		}
		Arrays.sort(arr);
		return arr[arr.length-2];
		
		
	}

}
