package com.tnsif.arrays;

import java.util.Arrays;

public class ArrayDemo {
		public static void main(String[] args) {
			//get array
			int arr[]= {10,20,30,40,50};
			//print array
			System.out.println(Arrays.toString(arr));
			
			//sort array
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		  
			//binary search
			int key=30;
			System.out.println(Arrays.binarySearch(arr, key));
			System.out.println(Arrays.binarySearch(arr,0,3,40));
			//array comparison
			System.out.println(Arrays.toString(arr));
			
			//get second array
			int intArr1[]= {10,50,34,36,89};
			System.out.println(Arrays.toString(intArr1));
			
			//compare both arrays
			if(Arrays.compare(arr, intArr1)==0) {
				System.out.println("Both arrays are same");
			}
			else
			{
				System.out.println("Both arrays are different");
			}
			
			//copy array
			int arr2[]=Arrays.copyOf(intArr1, 2);
			System.out.println(Arrays.toString(arr2));
			
			int arr3[]=Arrays.copyOfRange(arr, 0, 4);
			System.out.println(Arrays.toString(arr3));
			
			
			
		
		}
}
