package com.in28minutes.java_8;

public class ThreadRunner {

	public static void main(String[] args) {
		ThreadClass threadclass = new ThreadClass();
//		Thread thread = new Thread(threadclass);
		threadclass.start();

	}

}
