package com.in28minutes.java_8;

import java.util.List;
import java.util.PriorityQueue;

public class PetrolDistance {

	public static void main(String[] args) {
		List<List<Integer>> petrolpumps = List.of(List.of(1,5),List.of(10,3),List.of(3,5));
		
		System.out.println(truckTour(petrolpumps));

	}
	
	public static int truckTour(List<List<Integer>> petrolpumps) {
        boolean flag = false;
        int petrol = 0;
        int distance = 0;
//        int index= 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i=0;i<petrolpumps.size();i++){
        	if(flag==true){
                petrol += petrolpumps.get(i).get(0);
                distance += petrolpumps.get(i).get(1);
            }else{
                petrol = petrolpumps.get(i).get(0);
                distance = petrolpumps.get(i).get(1);
            }
        	
            if(petrol >=  distance){
                flag = true;
                que.add(i);
                
            }else {
            	flag=false;
            	que.clear();
            	petrol = 0;
                distance = 0;
            }
            
            
        }
        return que.peek();

    }

}
