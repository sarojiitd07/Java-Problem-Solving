package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortbyFrequency  implements Comparator<SortbyFrequency>{
	private int n;
	private int fre;
	public SortbyFrequency(int n, int fre) {
//		super();
		this.n = n;
		this.fre = fre;
	}

	@Override
	public int compare(SortbyFrequency o1, SortbyFrequency o2) {
		if(o1.fre>o2.fre) {
			return -1;
		}else if(o1.fre==o2.fre) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Integer [] arr = {4,3,5,5,7,9,4,6,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List<SortbyFrequency> list = new ArrayList<>();
		List<Integer> collect = Arrays.stream(arr).collect(Collectors.toList());
		List<Integer> collect2 = collect.stream().sorted().
				sorted(Comparator.comparing(e->Collections.frequency(collect, e),Comparator.reverseOrder()))
				.collect(Collectors.toList());
		System.out.println(collect2);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int fre = 1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						fre +=1;
						arr[j]=0;
					}
				}
				list.add(new SortbyFrequency(arr[i], fre));
			}
			
		}
//		SortbyFrequency [] arr2 = new SortbyFrequency [3];
//		arr2[0] =  new SortbyFrequency(1, 4);
//		arr2[1] =  new SortbyFrequency(2, 8);
//		arr2[2] =  new SortbyFrequency(5, 7);
//		Arrays.sort(arr2, new SortbyFrequency(0, 0));
//		for(int i=0;i<arr2.length;i++) {
//			System.out.println(arr2[i].n + " "+arr2[i].fre + " ");
//		}
//		System.out.println(Arrays.toString(arr2));
		Collections.sort(list, new SortbyFrequency(0, 0));
		
		int [] arr1 = new int[arr.length];
		int count = 0;
		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).n + " "+list.get(i).fre + " ");
			for(int j=0;j<list.get(i).fre;j++) {
				arr1[count]=list.get(i).n;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
