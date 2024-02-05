package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {

	public static void main(String[] args) {
		Integer [] arr1 = {1,2,8,4,5,3,7,12};
		List<Integer> arr = Arrays.asList(arr1);
		List<Integer> list = new ArrayList<>(arr);
		System.out.println(median(list));
		char ch = 'd' + 2;
		System.out.println(ch);

	}

	private static float median(List<Integer> list) {
		Collections.sort(list);
		System.out.println(list);
		if(list.size()%2==0) {
			return ((float) list.get(list.size()/2-1)+ (float)list.get(list.size()/2))/2;
		}else {
			return list.get(list.size()/2);
		}
		
	}

}
