package com.java.day6;

public class MyClass {
	
           private int section;
           private static int srno;
           
           static {
        	   System.out.println("in static block");
        	   //section=32;  can not use non static member
        	   srno=34;
           }
         //default constructor
		public MyClass() {
			System.out.println("default constructor");
			srno++;
			section++;
		}
		@Override
		public String toString() {
			return "MyClass [section=" + section + ",srno=" + srno + "]";
		}
   //non-static method		
         public void display() {
        	 System.out.println(srno);
        	 System.out.println(section);
         }
         
    
}




















