//package com.in28minutes.java_8;
//
//public class StudentBuilderDesign {
//
//	public static void main(String[] args) {
//		Student build = new Student.Builder().setId(10).setmarks(50).setName("saroj").build();
//		Student build1 = new Student.Builder().setName("saroj").setId(10).setmarks(50).build();
//
//		System.out.println(build);
//		System.out.println(build1);
//
//
//	}
//
//}
//
//class Student{
//	private int id;
//	private String name;
//	private int marks;
//	
//	public Student() {
//		
//	}
//	
//	public int getId() {
//		return id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getMarks() {
//		return marks;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student:[ id="+ id + ", Name=" + name+ ", Marks="+ marks +" ]";
//	}
//	
//	static class Builder{
//		private Student student;
//		
//		public Builder() {
//			student = new Student();
//		}
//		
//		public Builder setId(int id) {
//			student.id = id;
//			return this;
//		}
//		public Builder setName(String name) {
//			student.name=name;
//			return this;
//		}
//		public Builder setmarks(int marks) {
//			student.marks=marks;
//			return this;
//		}
//		
//		public Student build() {
//			return student;
//		}
//	}
//}