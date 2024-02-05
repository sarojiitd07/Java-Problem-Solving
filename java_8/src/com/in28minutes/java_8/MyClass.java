package com.in28minutes.java_8;


public class MyClass implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+1);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception ex){
//				System.out.println(ex);
//			}
		}
	} 

	public static void main(String[] args){
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t1);
		thread1.setPriority(1);
		thread2.setPriority(2);
		thread1.start();
		Thread t = Thread.currentThread();
		t.setName("myThread");
		thread2.start();
		System.out.println(t.getName());
		System.out.println(thread1.getId());
	}
}
