package com.in28minutes.basics;

public class Queue {
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] arr;
	
	Queue(int c){
		front = rear = 0;
		capacity =c;
		arr = new int[capacity];
	}
	
	public static void remove() {
		if(rear==0) {
			System.out.println("queue is empty");
		}else {
			System.out.println(arr[front]);
			for(int i = 0;i<rear-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[rear-1] = 0;
			rear--;
		}
	}
	
	public static void add(int a) {
		if(rear==capacity) {
			System.out.println("queue is full");
		}else {
			arr[rear] = a;
			rear++;
		}
	}
	
	public static int size() {
		return rear;
	}
	
	public static boolean isEmpaty() {
		if(rear==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void pick() {
		if(rear==0) {
			System.out.println("queue is empty");
		}else {
			System.out.println(arr[front]);
		}
	}
	
	
}
