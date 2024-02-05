package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.List;

public class ToDoListRunner {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		System.out.println(toDoList.addTask(new Task("task1",true)));
		System.out.println(toDoList.addTask(new Task("task2",false)));
		System.out.println(toDoList.addTask(new Task("task3",true)));
		System.out.println(toDoList.addTask(new Task("task4",false)));
		
		System.out.println(toDoList.deleteTask("task1"));
		System.out.println(toDoList.markTaskCompleted(new Task("task5", true)));
		System.out.println(toDoList.getTasks());

	}

}

class Task{
	
	private String description;
	private boolean isTaskCompleted;
	
	public Task(String description, boolean isTaskCompleted){
		this.description = description;
		this.isTaskCompleted = isTaskCompleted;
	}
	
	public boolean isTaskCompleted() {
		return isTaskCompleted;
	}

	public void setMarkTaskAsComplete(boolean isTaskCompleted) {
		this.isTaskCompleted = isTaskCompleted;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return "Description: "+ description + " isCompleted: " + isTaskCompleted;
	}
}

class ToDoList{
	Task task = new Task("",false);
	List<Task> taskList = new ArrayList<>();
	public ToDoList() {
	}
	
	public String addTask(Task task) {
		taskList.add(task);
		return "Successfully added";
	}
	
	public String deleteTask(String des) {
		for(int i=0;i<taskList.size();i++) {
			if(taskList.get(i).getDescription().equals(des)) {
				taskList.remove(i);
				return "Successfully deleted";
			}
		}
		return "Not Found";
	}
	
	public String markTaskCompleted(Task task) {
		if(task.isTaskCompleted()==true) {
			return "Task Completed";
		}else {
			return "Task not completed";
		}
	}
	
	public List<Task> getTasks(){
		return taskList;
	}
}