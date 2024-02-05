package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students implements Comparator<Students>{
	public String name;
	public int age;
	public int marks;
	public Students(String name, int age, int marks) {
//		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.age>o2.age) {
			return 1;
		}else if(o1.age==o2.age) {
			return 0;
		}else {
			return -1;
		}
	}
	
//	@Override
//	public int compareTo(Students o) {
//		if(marks>o.marks) {
//			return 1;
//		}else if(marks==o.marks) {
//			return 0;
//		}else {
//			return -1;
//		}
//		
//	}
	
	

	public static void main(String[] args) {
		List<Students> studentsList = new ArrayList<>();
		studentsList.add(new Students("saroj",28,100));
		studentsList.add(new Students("Kedar",25,99));
		studentsList.add(new Students("sushish",26,95));
		studentsList.add(new Students("Megh",23,33));
		studentsList.add(new Students("anand",22,80));
		studentsList.add(new Students("viru",20,89));
		
		Students students = new Students("kamless",27,82);
		studentsList.add(students);

//		Collections.sort(studentsList);
		Collections.sort(studentsList, students);
		
		for(Students st:studentsList) {
			System.out.println(st.name + " "+ st.age + " "+ st.marks);
		}

	}
}
