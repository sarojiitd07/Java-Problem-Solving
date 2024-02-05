package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingStudents {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> list = new ArrayList<>();

        for(int i=0;i<=n;i++){
            list.add(scan.nextLine());
        }
        
        Priorities pri = new Priorities();
        List<Student> studnets = pri.getStudents(list);
        studnets.stream().forEach(e->System.out.println(e.getName()));
    }
}

class Student{
    private int id;
    private String name;
    private double cgpa;
    
    Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    
    public List<Student> getStudents(List<String> events){
        List<Student> list = new ArrayList<>();
        
        for(int i=1;i<events.size();i++){
        	String [] arr = events.get(i).split(" ");
            if(arr.length>1){
                list.add(new Student(Integer.parseInt(arr[3]),arr[1],Double.parseDouble(arr[2])));
                Comparator<Student> customComparator = Comparator.comparing(Student::getCGPA, Comparator.reverseOrder())
    					.thenComparing(Student::getName)
    					.thenComparing(Student::getID,Comparator.reverseOrder());
                Collections.sort(list,customComparator);
                				
            }else{
            	if(list.size()>=1) {
            		list.remove(0);
            	}     
            }   
        }
        if(list.size()==0) {
        	System.out.println("EMPTY");
        }
        return list;
    }
}
