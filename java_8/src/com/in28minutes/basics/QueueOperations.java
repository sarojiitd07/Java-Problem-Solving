package com.in28minutes.basics;

//import java.util.PriorityQueue;


public class QueueOperations {

	public static void main(String[] args) {
		Queue arrlist = new Queue(4);
		System.out.println(arrlist.isEmpaty());
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		System.out.println(arrlist.isEmpaty());
//		System.out.println(arrlist.size());
		arrlist.pick();
		arrlist.remove();
		arrlist.pick();
		arrlist.remove();
		arrlist.pick();
		arrlist.remove();
		arrlist.pick();
		arrlist.remove();
		arrlist.pick();
		arrlist.remove();
		arrlist.pick();
		
//		System.out.println(arrlist.toString());


	}

}
