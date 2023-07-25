package com.techMahindra;

import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int temp=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
	}
}
