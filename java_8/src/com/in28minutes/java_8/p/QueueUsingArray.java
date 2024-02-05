package com.in28minutes.java_8.p;

import java.util.Arrays;

public class QueueUsingArray<T> {
	private int index;
	private Object[] arr;
	private final static int capacity = 10;
	
	public QueueUsingArray(){
		index = 0;
		arr = new Object[capacity];
	}
	
	public void addElement(T element) {
		if(index==capacity) {
			reSize();
			arr[index]=element;
			index++;
		}else {
			arr[index]=element;
			index++;
		}
	}
	
	public T removeElement() {
		@SuppressWarnings("unchecked")
		T n = (T) arr[index-1];
		if(index==0) {
			throw new NullPointerException("Array Is Empaty");
		}else {
			for(int i=0;i<index-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[index-1]=0;
			index--;
			return n;
		}
	}

	private void reSize() {
		int newCapacity = arr.length*2;
		arr = Arrays.copyOf(arr, newCapacity);
	}
	
	private int getSize() {
		return index;
	}
	
	public boolean isEmpaty() {
		if(index==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void displayQue() {
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		QueueUsingArray<Integer> que = new QueueUsingArray<>();
		
		que.addElement(1);
		que.addElement(2);
		que.addElement(3);
		que.addElement(1);
		que.addElement(2);
		que.addElement(3);
		que.addElement(1);
		que.addElement(2);
		que.addElement(3);
		que.addElement(1);
		que.addElement(2);
		que.addElement(3);
		que.removeElement();
		que.removeElement();
		que.removeElement();
		que.removeElement();
		
		System.out.println(que.getSize());
		System.out.println(que.isEmpaty());
		que.displayQue();
		

	}

}
