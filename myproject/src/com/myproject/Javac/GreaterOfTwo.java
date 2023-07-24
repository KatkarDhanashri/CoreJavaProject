package com.myproject.Javac;

import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three input number: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" A is greater ");
		}
		else if(b>a && b>c){
			System.out.println(b+" B is graeter ");
		}
		else {
			System.out.println(c+" c is greater ");
		}
		
	}

}
