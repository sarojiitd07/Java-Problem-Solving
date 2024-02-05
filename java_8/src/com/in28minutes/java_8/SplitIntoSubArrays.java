package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitIntoSubArrays {

	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,1,6,2};
        int splitSize = 3;
    
        List<int[]> list=splitArray(array, splitSize);
        for(int i=0;i<list.size();i++) {
        	System.out.println(Arrays.toString(list.get(i)));
        }        	
	}
	
	public static List<int[]> splitArray(int[] array,int splitSize){
		int k=0;
		List<int[]> list = new ArrayList<>();
		int box = (int) Math.ceil((double)array.length/splitSize);
		for(int i=0;i<box;i++) {
			int[] arr = {};
			if(k+splitSize>array.length) {
				arr = new int[array.length-k];
			}else {
				arr = new int[splitSize];
			}
			for(int j=0;j<arr.length;j++) {
        		arr[j]=array[k];
        		k++;
        	}
        	list.add(arr);
		}
		return list;
	}
}


