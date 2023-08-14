package com.tnsif.Multiprocess;

public class ChildDemo {
public static void main(String[] args) {
	ChildThread c=new ChildThread(10,"Good Morning");
	c.start();
	System.out.println("End of the programe");
}
}
