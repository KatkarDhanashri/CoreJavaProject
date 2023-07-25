package com.techMahindra;

import java.util.Scanner;

public class CountOfDigit {
public static void main(String[] args) {
	int no;
	System.out.println("Enter no to count digits: ");
	Scanner s=new Scanner(System.in);
	no=s.nextInt();
	int count=0,rem;
	while(no!=0) {
		rem=no%10;
		count++;
		no=no/10;
	}
	System.out.println("count is: "+count);
}
}
