package com.javatnsf.String;

public class StringComparison  {
	public static void main(String[] args) {
		
		//creating strings using literals
		String s1="TNSIF";
		String s2="TNSIF";
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//==& equals
		System.out.println("case 1: "+s1==s2);//true
		System.out.println("case 2: "+s1==s3);//false
		System.out.println("case 3: "+s2.equals(s1));//true
		System.out.println("case 4: "+s2.equals(s4));//true
		System.out.println("case 6: "+s3==s4);//false
		System.out.println("case 7: "+s3.equals(s4));//true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	 //compareTo
		System.out.println(s1.compareTo("TNSIF"));
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s3.compareTo(s4));
		
	}
}
