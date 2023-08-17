package com.java.linkedlist;
import java.util.*;
public class ArraylistDemo {
public static void main(String[] args) {
	ArrayList<Integer>arr=new ArrayList<Integer>();
    arr.add(11);
    arr.add(20);
    arr.add(3);
    arr.add(14);
    arr.add(50);
    arr.add(6);
    arr.add(17);
    arr.add(8);
    arr.add(19);
    arr.add(10);
    System.out.println(arr);
    
    //access element in arraylist
    System.out.println(arr.get(4));
    
    //change item of list
    arr.set(2, 4);
    System.out.println(arr);
    
    //remove item of arraylist
    arr.remove(1);
    System.out.println(arr);
    
    //size of arraylist
    System.out.println(arr.size());
    
    //for loop through arraylist
    for(int i=0;i<arr.size();i++) {
    	System.out.println(arr.get(i));
    }
    
    //sort elements of array using sort method of collection
    Collections.sort(arr);
    for(int i:arr) {
    System.out.println(i);
    }
    //remove all elements of list
    arr.clear();
    System.out.println(arr);
    
   
    
}
}
