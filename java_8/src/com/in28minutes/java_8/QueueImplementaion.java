package com.in28minutes.java_8;

import java.util.Stack;

public class QueueImplementaion {
	
	Stack<Integer> stack1 = new Stack<>(); 
	Stack<Integer> stack2 = new Stack<>();

	public void deQueue(){
		if(stack1.size()==0){
			for(int i=stack2.size()-1;i>=0;i--){
				stack1.push(stack2.get(i));
			}
			System.out.println(stack1.pop());
			stack2.clear();
		}
		else{
			System.out.println(stack1.pop());
		}
			
	}

	public void InQueue(int n){
		System.out.println(stack2.push(n));
	}
	
	public void Elements() {
		for(int i=stack1.size()-1;i>=0;i--){
			System.out.println(stack1.get(i));
		}
		for(int i=0;i<stack2.size();i++) {
			System.out.println(stack2.get(i));
		}
	}
	

	public static void main(String[] args) {
		QueueImplementaion queueImplementaion = new QueueImplementaion();
		queueImplementaion.InQueue(1);
		queueImplementaion.InQueue(2);
		queueImplementaion.InQueue(3);
		queueImplementaion.deQueue();
		queueImplementaion.deQueue();
		queueImplementaion.deQueue();
		queueImplementaion.InQueue(4);
		queueImplementaion.deQueue();
		queueImplementaion.InQueue(5);
		queueImplementaion.InQueue(6);
		queueImplementaion.InQueue(7);
		queueImplementaion.deQueue();
		System.out.println("jaj");
		queueImplementaion.InQueue(8);
		queueImplementaion.InQueue(9);
		System.out.println("4567898445678984234567");
		queueImplementaion.Elements();

	}

}
