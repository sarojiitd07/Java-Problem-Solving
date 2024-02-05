package com.in28minutes.java_8;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler{

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());

		int [] arr= {1,2};
		System.out.println(arr[2]);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.err.println("Uncaught exception in thread " + t.getName() + ": " + e.getMessage());
	    // Log the exception
//	    logException(e);
	    // Perform other necessary actions, such as notifying developers or cleaning up resources
	    // You can also exit the application gracefully if needed
	    System.exit(1);
		
	}

}
