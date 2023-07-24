package com.tns.singletone;

public class MyClassDemo {
	public static void main(String[] args) {
		

MyClass obj=MyClass.getObject();
MyClass obj1=MyClass.getObject();

System.out.println(obj==obj1);

System.out.println(obj);
System.out.println(obj1);

	}
}
