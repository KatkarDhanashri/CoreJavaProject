package com.tns.MultilevelInheritance;

class Employee{
	float salary=40000;
}

class programmer extends Employee{
	int bonus=1000;
}

public class SingleInheritance {
public static void main(String[] args) {
	programmer p=new programmer();
	System.out.println(p.salary);
	System.out.println(p.bonus);
}
}
