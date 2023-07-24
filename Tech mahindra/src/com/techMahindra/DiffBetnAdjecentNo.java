package com.techMahindra;

import java.util.Scanner;

public class DiffBetnAdjecentNo {
	private static int AdjecentNoDiff(int n,int arr[]) {
		int sum=0,diff;
		for(int i=0;i<n-1;i++) {
			diff=Math.abs(arr[i]-arr[i+1]);
			sum=sum+diff;
		}
		return sum;	
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
	
	int r=AdjecentNoDiff(n,arr);
	System.out.println(r);
}
}
