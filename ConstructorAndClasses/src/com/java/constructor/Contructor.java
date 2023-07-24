package com.java.constructor;

public class Contructor {
	
	 int id;
	 String name;
	//Default constructor
	public Contructor(){
		System.out.println("Bike is Created");
	}
	
	//parameterized constructor
	public Contructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id+"  "+name);
	}
	public static void main(String[] args) {
		Contructor c=new Contructor();
		Contructor a=new Contructor(1,"Dhanu");
		a.display();
	}
}
