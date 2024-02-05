package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(6,7,8,9);
		System.out.println(mergeList(list1,list2));
	}

	private static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
		List<Integer> arrayList1 = new ArrayList<>(list1);
		List<Integer> arrayList2 = new ArrayList<>(list2);
		arrayList1.addAll(arrayList2);
		return arrayList1;
	}

}
