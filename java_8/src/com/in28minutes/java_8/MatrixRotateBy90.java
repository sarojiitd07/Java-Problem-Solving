package com.in28minutes.java_8;

import java.util.Arrays;

public class MatrixRotateBy90 {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int [][] arr1 = rotatedBy90(arr);
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	
	public static int[][] rotatedBy90(int[][] arr){
		int [][] resultarr = new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				resultarr[i][j]=arr[j][arr.length-1-i];
				
			}
		}
		return resultarr;
	}

}
