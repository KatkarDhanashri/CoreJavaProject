package com.myproject.Javac;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	n=s.nextInt();
	int rem,rev=0;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
}
}
