package com.in28minutes.java_8.p;

import java.util.Stack;

public class QueueUsingStack<T> {
	Stack<T> stack1 = new Stack<>();
	Stack<T> stack2 = new Stack<>();
	
	public QueueUsingStack() {
		
	}
	
	public void addElement(T element) {
		stack2.add(element);
	}
	
	public void removeElement() {
		if(stack1.isEmpty()) {
			for(int i=0;i<stack2.size();i++) {
				stack1.add(stack2.get(stack2.size()-1-i));
			}
			stack2.clear();
			stack1.remove(0);
		}else {
			stack1.remove(0);
		}
	}
	
	public int getSize() {
		return stack1.size()+stack2.size();
	}
	
	public boolean isEmpty() {
		if(stack1.size()+stack2.size()==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		QueueUsingStack<Integer> que = new QueueUsingStack<>();
		que.addElement(1);
		que.addElement(1);
		que.addElement(1);
		que.addElement(1);
		System.out.println(que.getSize());
		que.removeElement();
		que.removeElement();
		System.out.println(que.isEmpty());
		System.out.println(que.getSize());

	}

}
