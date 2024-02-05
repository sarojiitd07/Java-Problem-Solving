package com.in28minutes.java_8;

import java.util.Arrays;

public class Sorting012 {

	public static void main(String[] args) {
		int [] arr = {1,2,1,0,2,0,1,0,2,0,2,0,1,2,1,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(betterApproach(arr)));

	}
	
	public static int [] betterApproach(int[] arr) {
		int a=0;
		int b = 0;
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				a +=1;
			}else if(arr[i]==1) {
				b +=1;
			}else {
				c +=1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i<a) {
				arr[i]=0;
			}else if(i>=a & i<a+b) {
				arr[i]=1;
			}else {
				arr[i]=2;
			}
		}
		return arr;
	}

}
