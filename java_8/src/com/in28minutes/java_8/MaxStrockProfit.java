package com.in28minutes.java_8;

public class MaxStrockProfit {

	public static void main(String[] args) {
		int[] arr = {7,6,5,4,3,4};
		System.out.println(maxProfit(arr));
	}
	
	public static int maxProfit(int[] arr) {
		int max=0,min=arr[0];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				index = i;
			}
			
		}
		for(int i=index;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		int profit = max-min;
		if(profit<=0) {
			return 0;
		}else {
			return profit;
		}
		
	}

}
