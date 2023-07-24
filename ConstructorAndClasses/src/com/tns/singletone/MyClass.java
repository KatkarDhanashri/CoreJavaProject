package com.tns.singletone;

public class MyClass {
	
    private static MyClass obj=null;
    
	public static MyClass getObject() {
		// TODO Auto-generated method stub
		obj=new MyClass();
		return obj;
	}

}