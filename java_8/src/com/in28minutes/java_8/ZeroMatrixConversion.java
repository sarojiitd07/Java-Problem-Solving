package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroMatrixConversion {

	public static void main(String[] args) {
		String str = "madam";
		StringBuffer strb = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			strb.append(str.charAt(i));
		}
		System.out.println(strb.toString());
		ArrayList<Integer> list = new ArrayList<>(List.of(1,5,3));
		ArrayList<Integer> list1 = new ArrayList<>(List.of(1,0,3));
		ArrayList<Integer> list2 = new ArrayList<>(List.of(1,6,1));

		ArrayList<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();
		newList.add(list);
		newList.add(list1);
		newList.add(list2);
		System.out.println(zeroMatrix(newList,3,3));

	}
	
	static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                    System.out.println(Arrays.toString(row));
                    System.out.println(Arrays.toString(col));
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

}
