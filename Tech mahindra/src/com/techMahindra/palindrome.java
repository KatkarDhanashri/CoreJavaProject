package com.techMahindra;

import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		int no;
		System.out.println("Enter no to check: ");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev) {
			System.out.println(no+" is palindrome");
		}
		else
		{
			System.out.println(no+" is not palindrome");
		}
		
	}
}
