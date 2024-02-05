package com.in28minutes.java_8;

public class QueueImplimentation {
	
	private static int front,rear,capacity;
	private static int [] array;

	QueueImplimentation(int size){
		capacity = size;
		array = new int [capacity];
		front = 0;
		rear = 0;
	}
	
	public static void inQueue(int n) {
		if(rear==capacity) {
			System.out.println("Queue is full");
			
			return;
		}else {
			array[rear]=n;
			rear++;
		}
		
	}
	
	public static void deQueue() {
		if(front==rear) {
			System.out.println("Queue is empaty");
			return;
		}else {
			for(int i=0;i<rear-1;i++) {
				array[i] = array[i+1];
			}
			
			rear--;
		}
		
	}
	
	public int size() {
		return rear;
	}
	
	public void displayQueue() {
		for(int i=0;i<size();i++) {
			System.out.println(array[i]);
		}
	}
	
	public boolean isFull() {
		if(rear==capacity) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(front==size()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		QueueImplimentation q = new QueueImplimentation(4);   
	     
	        System.out.println("Initial Queue:");  
	       // print Queue elements   
//	        q.inQueue();   
	     
	        // inserting elements in the queue 
	        System.out.println(q.size());
	        q.displayQueue();
	        System.out.println(q.isEmpty());
	        q.inQueue(10); 
	        q.displayQueue();
	        q.deQueue(); 
	        q.displayQueue();
	        q.inQueue(30); 
	        q.displayQueue();
	        q.inQueue(50);   
	        q.inQueue(70); 
	        q.displayQueue();
	        q.inQueue(70);
	        q.inQueue(70);
	        System.out.println(q.isFull());
	        
	        q.inQueue(70);
	     
	        // print Queue elements   
	        System.out.println("Queue after Enqueue Operation:");  
	        q.displayQueue(); 

	        
	}

	

}
