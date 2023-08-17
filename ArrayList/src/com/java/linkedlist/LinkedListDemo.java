package com.java.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String>cars=new LinkedList<>();
	cars.add("BMW");
	cars.add("Innova");
	cars.add("Ertiga");
	cars.add("Aoudi");
	cars.add("Tata");
	cars.add("Maruti");
	System.out.println(cars);
	
	//add first
	cars.addFirst("Suzuki");
	System.out.println(cars);
	
	//add last
		cars.addLast("Suzuki");
		System.out.println(cars);
	
		//remove first
		cars.removeFirst();
		System.out.println(cars);
		
		//remove last
		cars.removeLast();
		System.out.println(cars);
		
		//get first
	    System.out.println(cars.getFirst());
				
		//get last
		System.out.println(cars.getLast());
		
				
}
}
