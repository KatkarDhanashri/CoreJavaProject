package com.techMahindra;

import java.util.Scanner;

public class Factoril {
public static void main(String[] args) {
	int n;
	System.out.println("Enter a number: ");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(n+" factorial is: "+fact);
}
}
