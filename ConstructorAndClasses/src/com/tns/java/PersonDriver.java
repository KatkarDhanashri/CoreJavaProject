package com.tns.java;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		//Scanner class object
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String Name=s.next();
		System.out.println("Enter Gender: ");
		String Gender=s.next();
		System.out.println("Enter Age: ");
		int Age=s.nextInt();
		System.out.println("Enter Income: ");
		double Income=s.nextDouble();
        
		person dhanu=new person();
		dhanu.setName(Name);
		dhanu.setAge(Age);
		dhanu.setGender(Gender);
		dhanu.setIncome(Income);
		
		TaxCalculator cal=new TaxCalculator();
		cal.TaxCalculation(dhanu);
	    System.out.println(dhanu);
		
	}
}
