package com.java.Abstraction;

public class Student implements Cloneable{
	
	//declare data member
	int rollno;
	String name;
	String Branch;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	//parameterized constructor
	public Student(int rollno, String name, String branch) {
	
		this.rollno = rollno;
		this.name = name;
		Branch = branch;
	}
	
	//print method
	
	public void print() {
		System.out.println("Name:"+name+"  rollno:"+rollno+"  branch:"+Branch+" ");
	}
	
//	public Object clone() throws CloneNotSupportedException{
//		
//		return super.clone();
//		
//	}
	
	public Student clone() throws CloneNotSupportedException{
		return (Student)super.clone();
	}

}
