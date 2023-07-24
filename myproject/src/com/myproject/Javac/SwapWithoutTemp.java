package com.myproject.Javac;

import java.util.Scanner;

public class SwapWithoutTemp {
public static void main(String[] args) {
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	a=s.nextInt();
	b=s.nextInt();
     
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+"  "+b);
}
}
