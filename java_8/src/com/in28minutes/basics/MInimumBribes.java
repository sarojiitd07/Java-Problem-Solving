package com.in28minutes.basics;

import java.util.Arrays;
import java.util.List;

public class MInimumBribes {

	public static void main(String[] args) {
		Integer[] arr = {2, 5, 1, 3, 4};
		List<Integer> list = Arrays.asList(arr);
		minimumBribes(list);

	}
	
	public static void minimumBribes(List<Integer> q) {
        int sum = 0;
        String str ="false";
        for(int i=0;i<q.size()-1;i++){
        	for(int j=0;j<q.size()-i-3;j++){
        		if(q.get(j)>q.get(j+1) && q.get(j)>q.get(j+2) && q.get(j)>q.get(j+3)){
                    str="true";
                }
                
            }
        	
            for(int j=0;j<q.size()-i-1;j++){
            	
            	if(q.get(j)>q.get(j+1)){
                    int temp = q.get(j);
                    q.set(j,q.get(j+1));
                    q.set(j+1,temp);
                    sum+=1;
                }
                
            }
            
        }
        if(str.equals("false")){
            System.out.println(sum);
        }else{
            System.out.println("Too chaotic");
        }

    }

}
