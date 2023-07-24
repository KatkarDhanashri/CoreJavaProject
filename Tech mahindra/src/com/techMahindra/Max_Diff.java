package com.techMahindra;

import java.util.Scanner;

public class Max_Diff {
	private static int Max_Diff(int n,int arr[]) {
		int diff, max=0;
		for(int i=0;i<n-1;i++) {
		diff=arr[i]-arr[i+1];
		if(diff>max) {
			max=diff;
		}
		}
		return max;
	}
	
public static void main(String[] args) {
	System.out.println("Enter a number. ");
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	int result=Max_Diff(n,arr);
	System.out.println(result);
}
}
