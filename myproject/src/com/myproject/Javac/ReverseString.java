package com.myproject.Javac;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	String n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter string:");
     n=s.next();
     String rev="";
     int l=n.length();
    for(int i=l-1;i>=0;i--) {
    	rev=rev+n.charAt(i);
    }
    System.out.println(rev);
	} 
}
