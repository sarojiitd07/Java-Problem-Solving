package com.in28minutes.basics;

public class ThreadRunner {

	public static void main(String[] args) {
		ThreadClass threadclass = new ThreadClass();
		Thread thread = new Thread(threadclass);
		thread.start();
	}
}
