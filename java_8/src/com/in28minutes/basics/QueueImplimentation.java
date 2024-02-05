package com.in28minutes.basics;

public class QueueImplimentation {
	private int front , rear;
	private int capacity;
	private int array[];
	
	public QueueImplimentation(int c) {
		front = rear = 0;
		capacity = c;
		array = new int[capacity];
	}
	
	public Boolean enque(int a) {
		if(capacity==rear) {
			System.out.println("queue is full");
			return false;
		}else {
			array[rear] = a;
			rear ++;
			return true;
		}
	}
	
	public Boolean denque() {
		if(capacity==front) {
			System.out.println("queue is empaty");
			return false;
		}else {
			for(int i=0;i<rear;i++) {
				array[i]=array[i+1];
			}
			array[rear]=0;
			rear--;
			return true;
		}
	}
	public Boolean isEmapaty() {
		if(rear==front) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		if(rear==front) {
			return 0;
		}else {
			return rear;
		}
	}
	
	public int peek() {
		if(rear==front) {
			System.out.println("queue is empaty");
			return -1;
		}else {
			return array[front];
		}
	}
	

	public static void main(String[] args) {
		QueueImplimentation que = new QueueImplimentation(10);
		System.out.println(que.enque(5));
		System.out.println(que.enque(4));
		System.out.println(que.enque(7));
		System.out.println(que.enque(9));
		System.out.println(que.size());
		System.out.println(que.peek());
		System.out.println(que);
		que.denque();
		System.out.println(que.size());
		que.size();
		System.out.println(que);
		que.isEmapaty();

	}

}
