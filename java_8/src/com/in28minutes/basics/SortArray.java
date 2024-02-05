package com.in28minutes.basics;

import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		Integer[] array = {12,3,4,5,67,481,273,26,7,9,0,4,7,9};
		Arrays.sort(array);
		List<Integer> arrayList  =Arrays.asList(array);
		arrayList.stream().forEach(e->System.out.print(e+" "));
		
		System.out.println();
		
		for(int i=0;i<array.length-1;i++) {
			Integer temp = array[i];
			for(int j=i+1;j<array.length-i-1;j++) {
				if(array[i]>array[j]) {
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.stream(array).sorted().forEach(e-> System.out.print(e+" "));

	}

}
