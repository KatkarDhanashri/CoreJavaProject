package com.techMahindra;

import java.util.Scanner;

public class DiffBetOdd_Even {
	
	private static int OddEvenDiff(int n,int arr[]) {
		
		int even=0,odd=0;
		for(int i=0;i<n;i++) {
			if(arr[i] % 2 ==0) {
				even=even+arr[i];
			}
			else
			{
				odd=odd+arr[i];
			}
		}
		return odd-even;

	}

public static void main(String[] args) {
	int n;
	System.out.println("enter length of array: ");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	
	int result=OddEvenDiff(n,arr);
	System.out.println(result);
}
}
