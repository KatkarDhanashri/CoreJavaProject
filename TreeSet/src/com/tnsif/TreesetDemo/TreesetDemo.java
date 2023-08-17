package com.tnsif.TreesetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		
		TreeSet<String>courses=new TreeSet<>();
		
		courses.add("Core-Java");
		courses.add("c++");
		courses.add("python");
		courses.add("hibernet");
		courses.add("springboot");
		
	    System.out.println(courses);
         SortedSet<String>cs=courses.subSet("c++","springboot");
	    //SortedSet<String>coursesSubset=courses.subSet("Core-Java", true,false, true);
	    System.out.println(cs);
	     courses.remove("c++");
	     System.out.println(courses);
	    
	     TreeSet<Student>students=new TreeSet<>();
	     
	      students.add(new Student("Dhanashri",12));
	      students.add(new Student("Vijay",54));
	      students.add(new Student("Vedika",67));
	      students.add(new Student("Vedu",7));
	      students.add(new Student("Praju",32));
	      
	      
	      System.out.println(students);
	}

}
