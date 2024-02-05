package com.in28minutes.java_8;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(subArraySum(arr));
		System.out.println(bestArraySumApproch(arr));

	}
	
	public static int subArraySum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int subArraySum = 0;
			for(int j=i;j<arr.length;j++) {
				subArraySum += arr[j];
				if(subArraySum<0) {
					break;
				}
				if(subArraySum>maxSum) {
					maxSum = subArraySum;
				}
			}
			
		}
		return maxSum;
	}
	
	public static int bestArraySumApproch(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int subArraySum = 0;
		for(int j=0;j<arr.length;j++) {
			subArraySum += arr[j];
			if(subArraySum<0) {
				subArraySum = 0;
			}
			if(subArraySum>maxSum) {
				maxSum = subArraySum;
			}
		}
			
		return maxSum;
	}

}
