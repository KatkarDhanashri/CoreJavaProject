package com.tnsif.TreesetDemo;

public class Student  implements Comparable<Student>{
  private String name;
  private int RollNo;
  
  
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, int rollNo) {
	super();
	this.name = name;
	RollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
@Override
public String toString() {
	return "Student [name=" + name + ", RollNo=" + RollNo + "]";
}
@Override
public int compareTo(Student st) {
	// TODO Auto-generated method stub
	if(RollNo==st.RollNo) 
		return 0;
	else if(RollNo<st.RollNo)
		return 1;
	else
		return -1;
}

  
}
