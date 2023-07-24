package com.java.programs;

public class Operators {
public static void main(String[] args) {
	int x=10;  
	System.out.println(x++);//10   
	System.out.println(++x);//12  
	System.out.println(x--);  
	System.out.println(--x);
	int a=10;  
	int b=10;  
	System.out.println(a++ + ++a);//10+12=22  
	System.out.println(b++ + b++);
	
	System.out.println(a+b);//15  
	System.out.println(a-b);//5  
	System.out.println(a*b);//50  
	System.out.println(a/b);//2  
	System.out.println(a%b);
	
	System.out.println(10<<2);  
	System.out.println(10<<3);
	System.out.println(20<<2);  
	System.out.println(15<<4);
	
	int c=20;  
	System.out.println(a>b||a<c);  
	System.out.println(a>b|a<c); 
	System.out.println(a>b||a++<c);
	System.out.println(a); 
	System.out.println(a>b|a++<c);
	System.out.println(a);
	
	int min=(a<b)?a:b;  
	System.out.println(min); 
}
}
