package com.in28minutes.java_8.p;

public class University extends School{
	
    public static void main(String[] args) {
    	University U1 = new University();
    	System.out.println();
    	U1.c1.print();
	}
	
}

class School {
	
	public Class c1= new Class();

	@Override
	public String toString() {
		return "School [c1=" + c1 + "]";
	}


}

class Class{
	public void print() {
		System.out.println("class");
	}
	
}
