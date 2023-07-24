package com.myproject.Javac;

import java.util.Scanner;

public class LrgestOfTwoNo {
 public static void main(String[] args) {
	 int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three input number: ");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b) {
			System.out.println("A is greater ");
		}
		else
		{
			System.out.println("B is greater");
		}
}
}
