package com.java.constructor;

public class ConOverLoading {
	
	  int id;
	  String name;
	  int age;
	  
	public ConOverLoading(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public ConOverLoading(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(id+"  "+name+"  "+age);
	}
      public static void main(String[] args) {
    	  ConOverLoading c=new ConOverLoading(111,"karan");
    	  ConOverLoading d=new ConOverLoading(222,"Ram",43);
    	  d.display();
    	  
	}
}
