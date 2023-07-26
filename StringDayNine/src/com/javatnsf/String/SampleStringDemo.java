package com.javatnsf.String;

public class SampleStringDemo {
		public static void main(String[] args) {
			
			//initialize string
			char c[]= {'I','n','d','i','a'};
			String s1=new String(c);
			String s2=new String(s1);
			System.out.println(s1+"  "+s2);
			
			//concatenation to prevent long lines
			String longstr="This is to show"+" how long sentences"+" can be printed";
			System.out.println(longstr);
			
			System.out.println(s2);
			System.out.println(s1.length());
			int a=s2.length();
			System.out.println("length is"+a);
			
			String s3=s1.substring(1,7);
			System.out.println(s3);
			System.out.println(s1.trim());
			
			System.out.println(s1.stripTrailing());
			System.out.println(s1.isEmpty());
			
			//string comparison
			
			s1="Good Morning Students";
			s2=new String(s1);
			
			System.out.println("case 1:"+s1.equals(s2));
			System.out.println("case 2:"+s1==s2);
			
		}
}
