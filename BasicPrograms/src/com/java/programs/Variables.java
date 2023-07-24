package com.java.programs;

public class Variables {
	 static int m=100;//static variable  
	    void method()  
	    {    
	        int n=90;//local variable 
	        System.out.println(n);
	    } 
public static void main(String[] args) {
 
	        int data=50;//instance variable
	        Variables v=new Variables();
	        v.method();
}
}
