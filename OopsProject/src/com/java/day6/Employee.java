package com.java.day6;

public class Employee {
		private String name;
		private int empid;
		
		static String Companyname="TNS";

		public Employee(String name, int empid) {
			super();
			this.name = name;
			this.empid = empid;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", empid=" + empid + ",Companyname=" + Companyname +"]";
		}
		
		
		
}
