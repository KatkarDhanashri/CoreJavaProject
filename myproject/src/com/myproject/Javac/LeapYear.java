package com.myproject.Javac;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	int year;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	year=s.nextInt();
	if((year%400==0)||(year%4==0 && year%100!=0) ){
		System.out.println(year+" is leap year");
	}
	else
	{
		System.out.println(year+" is not a leap year");
	}
}
}
