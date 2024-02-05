package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//public class Student{
//	public String name;
//	public List<String> subjects;
//	public Student(String name,List<String> subjects) {
//		this.name = name;
//		this.subjects = new ArrayList<String> (subjects);
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getSubject(String subject) {
//		for(int i=0;i<subjects.size();i++) {
//			if(subjects.get(i)==subject) {
//				return subject;
//			}
//		}
//		return null;
//	}
//	
//	public String toString() {
//		return name + " " + subjects;
//	}
//
//	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("saroj",List.of("maths","chemistry","histry","sanskrit")));
//		list.add(new Student("Bhim",List.of("maths","python","histry","sanskrit")));
//		list.add(new Student("Sajeet",List.of("maths","chemistry","algebra","sanskrit")));
//		list.add(new Student("Raju",List.of("trigo","chemistry","histry","sanskrit")));
//		list.add(new Student("Manish",List.of("algebra","trigo","histry","sanskrit")));
////		List<Student> collect = list.stream().filter(student-> student.getSubject("maths")=="maths").collect(Collectors.toList());
//		List<Student> collect2 = list.stream().sorted((Student s1, Student s2)-> s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase()))
//				.collect(Collectors.toList());
////		for(int i=0;i<collect2.size();i++) {
////	    	 System.out.println(collect2.get(i).name);
////	     }
//		
//		List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
//		for(int i=0;i<collect.size();i++) {
//	    	 System.out.println(collect.get(i).name);
//	     }
//	}
//
//}
