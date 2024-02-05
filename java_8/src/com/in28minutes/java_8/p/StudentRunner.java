package com.in28minutes.java_8.p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"Saroj",List.of(99,88,55,60,54)));
		list.add(new Student(2,"Sharath",List.of(90,80,50,67,58)));
		list.add(new Student(3,"Madan",List.of(97,86,53,61,59)));
		list.add(new Student(4,"Kamal",List.of(70,80,58,61,54)));
		list.add(new Student(5,"Saroj",List.of(96,88,55,60,54)));
		
		List<Student> collect = list.stream()
				.sorted(Comparator.comparing(Student::getTotalMarks,Comparator.reverseOrder())
				.thenComparing(Student::getName)
				.thenComparing(Student::getRollNo))
				.collect(Collectors.toList());
		System.out.println(collect);
		Student st = new Student(1,"Saroj",List.of(99,88,55,60,54));
		System.out.println(st);
	}
}

class Student{
	private int rollNo;
	private String name;
	private List<Integer> marks;
	
	public Student(int rollNo, String name, List<Integer> marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = new ArrayList<>(marks);
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public Integer getTotalMarks() {
		Integer totalMarks = marks.stream()
                .mapToInt(Integer::intValue)
                .sum();
		return totalMarks;
	}
	
	public String toString() {
		return rollNo + " " + name + " " + getTotalMarks();
	}
}


