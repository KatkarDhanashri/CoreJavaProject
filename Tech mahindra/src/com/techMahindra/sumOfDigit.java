package com.techMahindra;

import java.util.Scanner;

public class sumOfDigit {
public static void main(String[] args) {
	int no;
	System.out.println("Enter no to count digits: ");
	Scanner s=new Scanner(System.in);
	no=s.nextInt();
	int sum=0,rem;
	while(no!=0) {
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println("sum is: "+sum);
}
}
