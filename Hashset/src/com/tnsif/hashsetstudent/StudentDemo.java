package com.tnsif.hashsetstudent;

import java.util.HashSet;
import java.util.Set;

public class StudentDemo {
	
	
  public static void main(String[] args) {
	Set<Student>stSet=new HashSet<Student>();
	addElements(stSet);
	System.out.println(stSet);
	
	
}

private static void addElements(Set<Student> stSet) {
	// TODO Auto-generated method stub
	Student s1=new Student("Dhanu",10);
	stSet.add(s1);
	Student s2=new Student("mayuri",10);
	stSet.add(s2);
	Student s3=new Student("Daku",10);
	stSet.add(s3);
	Student s4=new Student("priya",10);
	stSet.add(s4);
	Student s5=new Student("sanu",10);
	stSet.add(s5);
	Student s6=new Student("shrinidhi",10);
	stSet.add(s6);
	//duplicate elements are not allowed
}
}
