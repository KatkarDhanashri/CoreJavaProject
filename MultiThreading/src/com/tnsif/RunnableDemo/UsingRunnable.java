package com.tnsif.RunnableDemo;

public class UsingRunnable implements Runnable{
 Thread t;
 int end,start;
 String msg;
 
 
 
	public UsingRunnable(int end, int start, String msg) {
	super();
	this.end = end;
	this.start = start;
	this.msg = msg;
	t=new Thread(this,"Child Thread");
	t.start();
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=end;i>start;i--) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			System.out.println(i+" "+msg);
		}
	}
	
public static void main(String[] args) {
	//lambda expression useful in companies
		Runnable r2=()->System.out.println("Runnable with lambda expression");
	    new Thread(r2).start();
}
}
