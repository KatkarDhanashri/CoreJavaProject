package com.java.Constructor;
public class Main {
	int modelYear;
	  String modelName;
	  //Default constructor
     public Main() {}
     //Parameterised constructor
	  public Main(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

public static void main(String[] args) {
	Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
}
}
