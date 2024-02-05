package com.in28minutes.java_8;

import java.util.ArrayList;

public class PaskalTriangle {

	public static void main(String[] args) {
//		for(int i=0;i<6;i++) {
//			System.out.println(paskal(6));
			paskal(6);
//		}

	}
	
	public static ArrayList<ArrayList<Integer>> paskal(int n){
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> fixed = new ArrayList<>();

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					list.add(1);
				}else {
					list.add(fixed.get(j-1)+fixed.get(j));
				}
			}
			
			ArrayList<Integer>  clone = (ArrayList<Integer>) list.clone();
			
			matrix.add(clone);
//			System.out.println(matrix);
			fixed.clear();
			fixed.addAll(list);
//			System.out.println(fixed);
			list.clear();
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(matrix.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		return matrix;
	}

}
