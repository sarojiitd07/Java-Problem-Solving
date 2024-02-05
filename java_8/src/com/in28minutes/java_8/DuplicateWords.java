package com.in28minutes.java_8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			String skip = scan.nextLine();
			for(int j=0;j<5;j++){
			    String[] arr = scan.nextLine().split(" ");
//			    Arrays.stream(arr).forEach(e->System.out.print(e));
//			    System.out.println(Arrays.toString(arr));
			    StringBuffer strb = new StringBuffer();
      
			    for(int i=0;i<arr.length;i++) {
			        String pat="(^"+arr[i]+"$)";
			        Pattern ptr = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);
			        Matcher mtr = ptr.matcher(strb.toString());
			        
			        if(!mtr.matches()) {
			            strb.append(arr[i]);
			            strb.append(" ");          
			        }
			    }
			    System.out.println(strb);
			}
		}
    }
	

}
