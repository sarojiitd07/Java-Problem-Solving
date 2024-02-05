package com.in28minutes.basics;

public class TryCatch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		String temp = null;
		
		try {
//			temp = null;
			String str = temp.toLowerCase();
			System.out.println(str);
		} catch(RuntimeException ex){
			ex.printStackTrace();
		}
		
//		String str= null;
//		
//		try {
//			for(int i=0 ;i<5;i++) {
//				System.out.println(str.toLowerCase());
//			}
//		}catch(NullPointerException ex) {
//			ex.printStackTrace();
//		}
	}

}
