package com.tnsif.RunnableDemo;

public class RunnableDemo {
public static void main(String[] args) {
	//UsingRunnable ur=new UsingRunnable(10,1,"Hii");
	
	//older way
//	Runnable r1=new Runnable() {
//		public void run() {
//			System.out.println("Runnable with anonymous class");
//		}
//	};
//	Thread t1=new Thread(r1);
//	t1.start();
	
	
	//lambda expression useful in companies
	Runnable r2=()->System.out.println("Runnable with lambda expression");
    new Thread(r2).start();
}
}
