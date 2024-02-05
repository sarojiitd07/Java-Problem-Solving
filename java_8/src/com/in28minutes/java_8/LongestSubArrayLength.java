package com.in28minutes.java_8;

import java.util.Arrays;

public class LongestSubArrayLength{

	public static void main(String[] args) {
		int arr[] = {11, 12, 13, 23, 24, 26, 29, 2990, 245,2,2000002,34};
		String[] strArr = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			strArr[i]=arr[i]+"";
		}
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        int maxLength = 0;
        int count = 1;
        for(int i=1;i<strArr.length;i++){
            if(strArr[i-1].charAt(0)==strArr[i].charAt(0)) {
            	count++;
            	if(count>maxLength) {
            		maxLength=count;
            	}
            }else {
            	count=1;
            }
        }
		
		System.out.println(maxLength);
	}

}
