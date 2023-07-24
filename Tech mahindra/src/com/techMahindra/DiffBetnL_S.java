package com.techMahindra;

import java.util.Scanner;

public class DiffBetnL_S {
	private static int larg_small_Diff(int n,int arr[]) {
		int s=arr[0],l=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>l) {
				l=arr[i];
			}
			if(arr[i]<s) {
				s=arr[i];
			}
		}
		return l-s;
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
			int result=larg_small_Diff(n,arr);
			System.out.println(result);
		}
}
