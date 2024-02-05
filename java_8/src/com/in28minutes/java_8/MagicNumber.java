package com.in28minutes.java_8;

import java.util.Arrays;

public class MagicNumber {
	public static int count;
    public static void main(String[] args) {
    	for(int i=1000;i<10000;i++) {
    		count = 0;
    		System.out.println(i+" "+magicNumber(i));
    	}
    }
    
    public static int magicNumber(Integer n) {
    	char[] ch = String.format("%04d", n).toCharArray();
    	Arrays.sort(ch);
    	String minValue ="";
    	String maxValue ="";
    	for(int i=0;i<ch.length;i++) {
    		minValue += ch[i];
    		maxValue +=ch[ch.length-1-i];
    	}
    	Integer min = Integer.parseInt(minValue);
    	Integer max = Integer.parseInt(maxValue);
    	Integer diff = max-min;
    	if(diff==6174) {
    		count++;
    		return count;
    	}else {
    		count++;
    		if(diff==0) {
    			return 0;
    		}else {
    			magicNumber(diff);
    		}
    	}
    	return count;
    }
   
}

