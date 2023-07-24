package com.java.Abstraction;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
       Student s=new Student(12,"dhanu","ECE");
        s.print();
	  Student s2=(Student)s.clone();
	  s2.setRollno(22);
	  s2.setName("kajal");
	  s2.setBranch("CSE");
	  s2.print();
	  
	  Student s3=s.clone();
	  s3.setBranch("fdfd");
	  s3.setName("sarika");
	  s3.setRollno(54);
	  s3.print();
	}

}
