package com.java.Interface;

public class intfc implements printable {

	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		intfc o=new intfc();
		o.Print();
	}

}
