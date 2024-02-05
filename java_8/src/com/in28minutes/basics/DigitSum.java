package com.in28minutes.basics;

public class DigitSum {

	public static void main(String[] args) {
		System.out.println(superDigit("9875987598759875",5));
		

	}
	
	public static int superDigit(String n, int k) {
        if(n.length()==1){
            return Integer.valueOf(n);
        }else{
            int sum=0;
            for(int i=0;i<n.length();i++){
                sum += Character.getNumericValue(n.charAt(i));
            }
//            k--;
            String str = Integer.toString(sum);
            return superDigit(str,k);
        }
    }

}
