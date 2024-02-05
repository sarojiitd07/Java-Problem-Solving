package com.in28minutes.basics;

import java.util.Arrays;

public class ArraysRunner {

	public static void main(String[] args) {
		int[] arr = {10,12,98,45,12495,45,98,2345,6,656,898};
		
		System.out.println(sortedArray(arr));

	}
	
	public static  String sortedArray(int arr[]) {
//		int temp = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j]<arr[i]) {
//					temp =arr[i];
//					arr[i]=arr[j];
//					arr[j]= temp;
//				}
//			}
//		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return Arrays.toString(arr);
		
	}

}
