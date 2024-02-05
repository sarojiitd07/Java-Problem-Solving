package com.in28minutes.java_8;

public class MinSumOfArray{

	public static void main(String[] args) {
		int[] arr1 = {4,2,12,0,0};
		int[] arr2 = {2,4,12,1};
		int count1=0;
		int sum1 = 0;
		int sum2 = 0;
		int count2=0;
		int minSum = 0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				count1++;
			}else {
				sum1+=arr1[i];
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==0) {
				count2++;
			}else {
				sum2+=arr2[i];
			}
		}
		if(sum1>sum2 & count2==0) {
			minSum=-1;
		}else if(sum1>sum2) {
			minSum = sum1+count1;
		}else if(sum1<sum2 & count1==0) {
			minSum = -1;
		}else if(sum1<sum2) {
			minSum = sum2+count2;
		}else if(sum1==sum2) {
			minSum = sum1;
		}
		else {
			minSum =-1;
		}
		System.out.println(minSum);
	}

}


