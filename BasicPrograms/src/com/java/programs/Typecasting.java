package com.java.programs;
public class Typecasting {
public static void main(String[] args){
	
	int b=10;  
	float e=b;  
	System.out.println(b);  
	System.out.println(e); 
	
		float f=10.5f;  
		//int a=f;//Compile time error  
		int a=(int)f;  
		System.out.println(f);  
		System.out.println(a);  
		
		int d=130;  
		byte t=(byte)d;  
		System.out.println(d);  
		System.out.println(t); 
		
		byte g=10;  
		byte h=10;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte i=(byte)(g+h);  
		System.out.println(i);  
		}
}
