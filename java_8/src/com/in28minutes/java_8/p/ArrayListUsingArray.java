package com.in28minutes.java_8.p;

import java.util.Arrays;

public class ArrayListUsingArray{
	public static void main(String[] args) {
		Arraylist<Integer> myArrayList = new Arraylist<>();
		
		myArrayList.removeElement();
		myArrayList.addElement(1);
		myArrayList.addElement(2);
		myArrayList.addElement(3);
		myArrayList.addElement(1);
		myArrayList.addElement(2);
		myArrayList.addElement(3);
		myArrayList.addElement(1);
		myArrayList.addElement(2);
		myArrayList.addElement(3);
		myArrayList.addElement(1);
		myArrayList.addElement(2);
		myArrayList.addElement(3);
		System.out.println(myArrayList.removeElement());
		System.out.println(myArrayList.removeElement());
		myArrayList.removeElement();
		myArrayList.removeElement();
		myArrayList.removeElement();
		
	    System.out.println("Size: " + myArrayList.getSize());
	    System.out.println(myArrayList.isEmpty());
	    
	}
	
}

class Arraylist<T>{
	private static final int capacity = 10;
	private int index;
	private Object [] arr;
	
	public Arraylist(){
		arr = new Object[capacity];
		index = 0;
		}
	
	public void addElement(T n){
		if(index==arr.length){
			resizeArray();
      		arr[index]= n;
			index++;
		}else{
			arr[index]= n;
			index++;
		}
	}
	
	public T removeElement(){
		@SuppressWarnings("unchecked")
		T n = (T) arr[index-1];
		if(getSize()!=0){
			arr[index]=0;
			index--;
		}else {
			throw new NullPointerException("ArrayList is empty");
		}
		return n;
	}


	public int getSize(){
        return index;
    }

	
	private void resizeArray() {
		int newCapacity = arr.length * 2;
        arr = Arrays.copyOf(arr, newCapacity);
    }

	
	public boolean isEmpty() {
        if(getSize()==0){
        	return true;
    	}else{
        	return false;
        }
	}
	
}

